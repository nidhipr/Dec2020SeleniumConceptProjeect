package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {
static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://classic.freecrm.com/index.html");
			By username = By.name("username");
			By password = By.name("password");
			By login = By.xpath("//input[@type='submit']");
			
			driver.findElement(username).sendKeys("batchautomation");
			driver.findElement(password).sendKeys("Test@12345");
			driver.findElement(login).click();
			
			driver.switchTo().frame("mainpanel");
			driver.findElement(By.xpath("//a[text()='Contacts']")).click();
			selectContact("Chitra Automation");
			selectContact("Hi fish");
		////a[text()='Chitra Automation']/parent::td//following-sibling::td/span
		//	(//a[text()='Chitra Automation']/parent::td//following-sibling::td)[5]/a
		//	(//a[text()='Ganesh Dom'])[1]/parent::td
	}

	public static void selectContact(String name) {
		String checkboxxpath="//a[text()='"+name+"']/parent::td/preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(checkboxxpath)).click();
	}
}
