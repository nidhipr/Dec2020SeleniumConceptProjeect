package Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitUrlVerification {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		By facebook = By.xpath("//img[@alt='OrangeHRM on Facebook']");

		clickWhenReady(facebook, 5);

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String parentWindowId = it.next();
		String childWindowId = it.next();

		driver.switchTo().window(childWindowId);
		String childUrl = driver.getCurrentUrl();
		System.out.println("Child window title: " + childUrl);

		if (waitForExactUrlToBe(10, "https://www.facebook.com/OrangeHRM")) {
			System.out.println("Correct it is fb URL");
		}

		driver.close();

		driver.switchTo().window(parentWindowId);
		// driver.quit();

	}

	public static boolean waitForExactUrlToBe(int timeOut, String url) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlToBe(url));
	}

	public static WebElement waitForElementToBeClickable(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public static void clickWhenReady(By locator, int timeOut) {
		waitForElementToBeClickable(timeOut, locator).click();
	}

	public static boolean waitForUrlToBeMatched(int timeOut, String regex) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlMatches(regex));
	}
}
