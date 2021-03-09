package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver" ,"C:\\work\\chromedriver87\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	String title=driver.getTitle();
	System.out.println("page title is: "+title);
	
	if(title.equals("Google")) {
		System.out.println("correct title");
	}
	else {
		System.out.println("title is not correct");
	}
	System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	driver.quit();
	
	}
}
