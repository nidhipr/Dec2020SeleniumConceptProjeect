package Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumSessions.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwiggyScrollDownTest {
	static WebDriver driver;
	static JavaScriptUtil js;
	static ElementUtil elementUtil;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.id("location")).sendKeys("noida");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath("//div[@class='_1oLDb']//span[@class ='_2W-T9 _3ZBSs']")).click();

		By restName = By.className("BZR3j");

		waitForPresenceOfElement(restName, 5);

		String restCount = driver.findElement(restName).getText();
		System.out.println(restCount);

		String restnum = restCount.replace("restaurants", " ").trim();
		System.out.println(restnum);
		int num = Integer.parseInt(restnum);

		while (num >= 0) {
			js = new JavaScriptUtil(driver);
			js.scrollPageDown("200");

			By restName1 = By.xpath("//div[@class='nA6kb']");
			List<WebElement> restList = driver.findElements(restName1);
			// List<String> restListName = new ArrayList<String>();
			for (WebElement e : restList) {
				System.out.println(e.getText());
				num = num - 1;
				// System.out.println(num);

			}

		}

	}


	public static WebElement waitForPresenceOfElement(By locator, long timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}



}
