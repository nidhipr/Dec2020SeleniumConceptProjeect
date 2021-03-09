package testNgSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassiccrmTest extends BaseTest {


   
    
   @Test(priority = 1)
    public void titleTest() {
	  
    	String title = driver.getTitle();
    	System.out.println("Title of the page  :" + title);
    	Assert.assertEquals(title, "CRMPRO  - CRM software for customer relationship management, sales, and support");
}
    
   
    @Test(priority = 2)
    public void logoTest() {
    	Assert.assertTrue(driver.findElement(By.cssSelector("a.navbar-brand")).isDisplayed());
    }
    
   
}



