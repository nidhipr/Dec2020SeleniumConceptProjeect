package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpathFunctions {
static WebDriver driver;  
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		getLinkElement("Forgotten Password").click();
		

	}
	
	public static WebElement getLinkElement(String text) {
		
		return driver.findElement(By.xpath("//a[text()='"+text+"']"));
		
	}
	
public static WebElement getLinkElement(String tag,String text) {
		
		return driver.findElement(By.xpath("//"+tag+"[text()='"+text+"']"));
		
	}

}
