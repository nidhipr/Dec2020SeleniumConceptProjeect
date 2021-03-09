package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {
static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By firstName = By.id("Form_submitForm_FirstName");
		By contactSales = By.linkText("CONTACT SALES");
		
//		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(firstName), "nidhi").perform();
//		act.click(driver.findElement(contactSales)).perform();

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(locator), "value").perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(locator)).perform();
	}
}
