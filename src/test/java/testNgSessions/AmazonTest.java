package testNgSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest extends BaseTest {
	
	

    
    @Test(priority = 1)
    public void titleTest() {
    		
    	String title = driver.getTitle();
    	System.out.println("Title of the page  :" + title);
    	Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
}
    
    @Test(priority = 2)
    public void urlTest() {
    	String url = driver.getCurrentUrl();
    	Assert.assertTrue(url.contains("amazon"));
    }
    
    @Test(priority = 3)
    public void logoTest() {
    	Assert.assertTrue(driver.findElement(By.id("nav-logo")).isDisplayed());
    }
    
  
}
