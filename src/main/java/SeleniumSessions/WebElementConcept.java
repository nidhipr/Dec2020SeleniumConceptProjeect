package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//create webelement & perform action
		// 1.
		// driver.findElement(By.id("input-email")).sendKeys("nidhi@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("india@123");
//2.
//		WebElement emailId=driver.findElement(By.id("input-email"));
//		emailId.sendKeys("priya@gmail.com");
//		WebElement password=driver.findElement(By.id("input-password"));
//		password.sendKeys("india@123");

		// 3.by locator:or
		By email = By.id("input-email");
		By password = By.id("input-password");
//		WebElement emailId=driver.findElement(email);
//		WebElement pwd=driver.findElement(password);
//		emailId.sendKeys("kiran@gmail.com");
//		pwd.sendKeys("india@123");
//		
		// 4
//		getElement(email).sendKeys("naveen@gmail.com");
//		getElement(password).sendKeys("india@123");

		// 5
		// doSendKeys(email,"richa@gmail.com");
		// doSendKeys(password,"789.com");

		// By email = By.id("input-email");
		// By password = By.id("input-password");
		By loginButton = By.xpath("//*[@id=\'content\']/div/div[2]/div/form/input");
//6
		doSendKeys(email, "nidhi@gmail.com");
		doSendKeys(password, "india@123");
		doClcick(loginButton);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClcick(By locator) {
		getElement(locator).click();
	}

}
