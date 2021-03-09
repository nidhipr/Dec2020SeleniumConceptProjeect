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

public class OrangeHrmTest extends BaseTest{
			  
	   @Test(priority = 1)
	    public void titleTest() {
		  
	    	String title = driver.getTitle();
	    	System.out.println("Title of the page  :" + title);
	    	Assert.assertEquals(title, "Free Human Resource Management Software | 30 Day Trial Creation");
	}
	    
	   
	    @Test(priority = 2)
	    public void logoTest() {
	    	Assert.assertTrue(driver.findElement(By.className("nav-logo")).isDisplayed());
	    }
	    
	   

}
