package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		By username = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//input[@type='submit']");
		
		driver.findElement(username).sendKeys("batchautomation");
		driver.findElement(password).sendKeys("Test@12345");
		driver.findElement(login).click();
		
		driver.switchTo().frame("mainpanel");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("CONTACTS"))).perform();
		driver.findElement(By.xpath("//i[@class='fa fa-sign-out icon-2x']")).click();
		driver.switchTo().defaultContent();
		
	}
	
}
