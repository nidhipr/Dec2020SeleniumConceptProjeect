package testNgSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestBM {
	WebDriver driver;
	
    @BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");	
	}
   // @Ignore
    @Test
    public void titleTest() {
    	String title = driver.getTitle();
    	System.out.println("Title of the page  :" + title);
    	Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
}
    
    @Test(enabled= true)
    public void urlTest() {
    	String url = driver.getCurrentUrl();
    	Assert.assertTrue(url.contains("amazon"));
    }
    
    @Test
    public void logoTest() {
    	Assert.assertTrue(driver.findElement(By.id("nav-logo")).isDisplayed());
    }
    
    @AfterMethod
    public void tearDown() {
    	driver.quit();
    }
}
