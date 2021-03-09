package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	//	driver.get("https://classic.freecrm.com/");
		driver.get("https://www.amazon.in");
		By navigationList = By.id("nav-xshop12");
		By username = By.name("username");
//		
//		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
//	                          .withTimeout(Duration.ofSeconds(10))
//                              .pollingEvery(Duration.ofSeconds(2))
//                              .ignoring(StaleElementReferenceException.class)
//                              .ignoring(NoSuchElementException.class);
//		
//		
//WebElement ele =wait.until(ExpectedConditions.presenceOfElementLocated(username));
//
//ele.sendKeys("nidhi@gmail.com");
		//waitForElementWithFluentWait(10, 2, username).sendKeys("nidhi@gmail.com");
		waitVisibilityOfWithFluentWait(10,2,navigationList);
		
		
	}

	 public static WebElement waitForElementWithFluentWait(int timeOut, int pollingTime, By locator) {
                 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))		 
				.pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(StaleElementReferenceException.class)
				.ignoring(NoSuchElementException.class);
                 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	 public static WebElement waitVisibilityOfWithFluentWait(int timeOut, int pollingTime, By locator) {
                  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				 .pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(StaleElementReferenceException.class)
				 .ignoring(NoSuchElementException.class);
		          WebElement ele = driver.findElement(locator);
		          return wait.until(ExpectedConditions.visibilityOf(ele));
	}

	 public static WebElement waitVisibilityOfElementWithFluentWait(int timeOut, int pollingTime, By locator) {
                  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
		          .pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(StaleElementReferenceException.class)
		          .ignoring(NoSuchElementException.class);
                   return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
}
	
	 public static Alert waitForAlertWithFluentWait(int timeOut, int pollingTime, By locator) {
                   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
                   .pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(StaleElementReferenceException.class)
                   .ignoring(NoSuchElementException.class);
                   return wait.until(ExpectedConditions.alertIsPresent());
}
	 public static WebElement waitForElementToBClickbletWithFluentWait(int timeOut, int pollingTime, By locator) {
                   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
                   .pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(StaleElementReferenceException.class)
                   .ignoring(NoSuchElementException.class);
                    return wait.until(ExpectedConditions.elementToBeClickable(locator));
}
	 
	 public static void ClickWhenReadytWithFluentWait(int timeOut, int pollingTime, By locator) {
		           waitForElementToBClickbletWithFluentWait(timeOut, pollingTime, locator).click();
	 } 
	 
	 public static void getAttributeWithFluentWait(int timeOut, int pollingTime, By locator,String name) {
		           waitForElementToBClickbletWithFluentWait(timeOut, pollingTime, locator).getAttribute(name);
	 } 
	 
	 public static boolean waitForElementToBSelectedtWithFluentWait(int timeOut, int pollingTime, By locator) {
                   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
                   .pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(StaleElementReferenceException.class)
                   .ignoring(NoSuchElementException.class);
                   return wait.until(ExpectedConditions.elementToBeSelected(locator));
}
	 
	 public static boolean waitForTextToBetWithFluentWait(int timeOut, int pollingTime, By locator,String text) {
                   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
                   .pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(StaleElementReferenceException.class)
                   .ignoring(NoSuchElementException.class);
                   return wait.until(ExpectedConditions.textToBe(locator, text));
	 }
	 
	 public static boolean waitForUrlContainstWithFluentWait(int timeOut, int pollingTime, By locator,String url) {
                   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
                   .pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(StaleElementReferenceException.class)
                   .ignoring(NoSuchElementException.class);
                   return wait.until(ExpectedConditions.urlToBe(url));
}
	 public static boolean waitForExactUrlToBeWithFluentWait(int timeOut, int pollingTime, By locator,String url) {
                    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
                   .pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(StaleElementReferenceException.class)
                   .ignoring(NoSuchElementException.class);
                    return wait.until(ExpectedConditions.urlToBe(url));
}
	 
	 public static WebDriver waitForFrameToBeAvailableWithFluentWait(int timeOut, int pollingTime, By locator) {
                   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
                   .pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(StaleElementReferenceException.class)
                   .ignoring(NoSuchElementException.class);
                    return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
}
	 public static WebDriver waitForFrameToBeAvailableWithFluentWait(int timeOut, int pollingTime, int frameIndex) {
                    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
                   .pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(StaleElementReferenceException.class)
                   .ignoring(NoSuchElementException.class);
                    return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
}
	 public static WebDriver waitForFrameToBeAvailableWithFluentWait(int timeOut, int pollingTime, String frameName) {
                   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
                  .pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(StaleElementReferenceException.class)
                  .ignoring(NoSuchElementException.class);
                  return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameName));
}
	 
}
