package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlertConcept {
         static WebDriver driver;
	     public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 
		 WebDriverWait wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.alertIsPresent());
		 
		 

	}	

}
