package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitWithFrame {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		By username = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//input[@type='submit']");
		
		ElementUtil1 ele = new ElementUtil1(driver);
		ele.getElement(username).sendKeys("batchautomation");
		ele.getElement(password).sendKeys("Test@12345");
		ele.getElement(login).click();
		
		ele.waitForFrameToBeAvailable(10, "mainpanel");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("CONTACTS"))).perform();
		By logout=By.xpath("//i[@class='fa fa-sign-out icon-2x']");
		
		ele.getElement(logout).click();
		
		
		
		
		
		
		
		

	}

}
