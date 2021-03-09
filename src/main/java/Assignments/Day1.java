package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver87\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	System.out.println(driver.getTitle());
	String url=driver.getCurrentUrl();
	System.out.println("Url of the page is: "+url);
	if(url.contains("facebook")) {
		System.out.println("correct url");
	}
	else {
		System.out.println("incorrect url");
	}
	driver.quit();
	

	}

}
