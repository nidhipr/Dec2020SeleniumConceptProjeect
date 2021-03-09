package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");	
        By email = By.id("input-email");
        
//        WebDriverWait wait = new WebDriverWait(driver,10);
//        WebElement ele =wait.until(ExpectedConditions.presenceOfElementLocated(email));
//        ele.sendKeys("nidpriya@gmail.com");
        waitForPresenceOfElement(email,10).sendKeys("nidhi@gmail.com");

	}
	
	public static WebElement waitForPresenceOfElement(By locator, long timeOut) {
		 WebDriverWait wait = new WebDriverWait(driver,timeOut);
	     return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

}
