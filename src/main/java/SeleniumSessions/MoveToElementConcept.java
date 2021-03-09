package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		By mainMenu =By.className("menulink");
		By courses = By.linkText("COURSES");
		doMoveToElement(mainMenu);
		doClick(courses);
		
//		Actions act= new Actions(driver);
//		act.moveToElement(driver.findElement(By.className("menulink"))).perform();
//		driver.findElement(By.linkText("COURSES")).click();

	}
	 public static WebElement getElement(By locator) {
		 return driver.findElement(locator);
	 }
	public static void doMoveToElement(By locator) {
		Actions act= new Actions(driver);
	    act.moveToElement(getElement(locator)).perform();
	   	
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
