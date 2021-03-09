package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		
		//Thread.sleep is static wait & it is java feature
		//dynamic wait: selenium wait 
		//2 type of wait in selenium- implicit wait & explicit wait
		// Global wait - a dynamic wait--globally applied for all the Webelement.
		//whenever you are creating webelement with findElement & find Elements method.
		//Implicit wait will be applied.
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.name("q11")).sendKeys("nidhipriya");
		
		

	}

}
