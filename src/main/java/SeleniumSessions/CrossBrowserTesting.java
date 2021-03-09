package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	static WebDriver driver;

	public static void main(String[] args) {
		
		//WebDriver driver=null;
		String browser = "chrome";
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver87\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browser.equals("safari")) {
			driver = new SafariDriver();
				}
		
		else {
			System.out.println("Please pass the correct browser name");
		}
		driver.get("https://www.amazon.com");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		

	}

}
