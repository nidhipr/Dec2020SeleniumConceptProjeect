package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	
	//WebDriverWait can be applied for all the webelement whenever needed.
	//it can also be applied for non web element:alert, url,title.
 static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		//By email = By.id("input-email");
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		WebElement emailEle=wait.until(ExpectedConditions.presenceOfElementLocated(email));
		//emailEle.sendKeys("nidhi123@gmail.com");
//		waitForPresenceOfElement(email,10).sendKeys("nidhi@gmail.com");
//		
//		By listEle = By.cssSelector(".list-group a");
//		waitForVisibiltyOfElements(5,listEle).stream().forEach(ele->System.out.println(ele.getText()));
//		
//		By forgotPassword = By.linkText("Forgotten Password");
//		clickWhenReady(forgotPassword,5);
//		if(waitForUrlToBe(3,"forgotten")) {
//			System.out.println("correct url");
//		}
		
		By Register = By.xpath("(//div[@class='list-group']/a)[2]");
		clickWhenReady(Register,5);
		By Newsletterchecked =By.xpath("(//input[@name='newsletter'])[2]");
		if(waitForElementToBeSelected(5,Newsletterchecked)) {
			System.out.println("true");
		}
		
	
			
		
		
		

	}
	
	public static WebElement waitForPresenceOfElement(By locator,int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	/**
	 * An expectation for  checking that an element known to be present on DOM of the page is visible.
	 * visiblity means that element is not only displayed but also has height & width greater than zero.
	 *
	 */
	
	public static void waitVisiblityOfElement(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
				WebElement ele = driver.findElement(locator);
				wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
	public static List<WebElement> waitForVisibiltyOfElements(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public static WebElement waitForElementToBeClickable(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static void clickWhenReady(By locator ,int timeOut) {
		waitForElementToBeClickable(timeOut,locator).click();
	}
	public static void getAttribute(By locator ,int timeOut, String name) {
		waitForElementToBeClickable(timeOut,locator).getAttribute(name);
	}	
	
	public static boolean waitForElementTextToBe(By locator ,int timeOut, String text) {
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.textToBe(locator, text));
		
	}	
	
	public static boolean waitForUrlToBe(int timeOut, String urlValue) {
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.urlContains(urlValue));
		
	}
	
	public static boolean waitForExactUrlToBe(int timeOut, String url) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlToBe(url));
	}
	
	public static boolean waitForUrlToBeMatched(int timeOut, String regex) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlMatches(regex));
	}
	
	/**
	 * An expectation of checking if the given element to be selected.
	 * @param timeOut
	 * @param locator
	 * @return
	 */
	
	public static boolean waitForElementToBeSelected(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.elementToBeSelected(locator));
	}
	
	public static void waitForFrameToBeAvailable(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}
	
}
