package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		WebElement indus_ele = driver.findElement(industry);
		WebElement count_ele = driver.findElement(country);
		doSelectByVisibleText(industry,"Government - Local");
		doSelectByValue(country,"India");
//		 Select select = new Select(indus_ele);
//		 select.selectByIndex(4);
//		 Thread.sleep(3000);
//		 select.selectByVisibleText("Government - Local");
//		 Thread.sleep(3000);
//		 select.selectByValue("Business Services/Consultancy");
//		 Select select1 = new Select(count_ele);
//		 select1.selectByValue("India");
		

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelectByVisibleText(By locator,String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	public static void doSelectByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
}
