package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTitleConcept {
	
         static WebDriver driver;
	     public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.titleContains("Online Shopping"));
//		String text = driver.getTitle();
//		System.out.println(text);
		
		//String text = waitForTitleContains(10,"Online Shopping");
		//System.out.println(text);
	//	waitForTitleIs(10,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
		driver.findElement(By.linkText("Fashion")).click();
		if(waitForTitle(10,"Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids")){
			System.out.println("Landed on Amazon Fashion page");
		}

	}
	     
	     public static String waitForTitleContains(int timeOut, String title ) {
	    	 WebDriverWait wait = new WebDriverWait(driver,timeOut);
	 		wait.until(ExpectedConditions.titleContains(title));
	    	return driver.getTitle(); 
	     }
	     
	     public static String waitForTitleIs(int timeOut, String title) {
	    	 WebDriverWait wait = new WebDriverWait(driver,timeOut);
		 	 wait.until(ExpectedConditions.titleIs(title)); 
		 	return driver.getTitle();
	     }
	     
	     public static Boolean waitForTitle(int timeOut, String title) {
	    	 WebDriverWait wait = new WebDriverWait(driver,timeOut);
		 	return wait.until(ExpectedConditions.titleIs(title)); 
		 	
	     }

}
