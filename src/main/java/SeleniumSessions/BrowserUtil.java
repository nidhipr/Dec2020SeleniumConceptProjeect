package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	WebDriver driver;
	
	/**
	 * This method is used to intialize the webdriver on  the basis of browserName
	 * @param browserName
	 * @return this method returns webdriver reference
	 */
	public WebDriver launchBrowser(String browserName) {
		System.out.println("launching the browser :"+browserName);
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
		    driver= new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;
		case "safari":
		    driver= new SafariDriver();
			break;

		default:
			System.err.println("Incorrect browser name");
			break;
		}
		return driver;
		
	}
/**
 * This method is used to enter the url in the Browser
 * @param url
 * 
 */
	
	public void launchUrl(String url) {
		if(url.isEmpty()) {
			System.out.println("url is blank "+url);
			return;
		}
		driver.get(url);
	}	
	
	/**
	 * This method is used to get the title of the page
	 * @return title of the page
	 */
		public String getPageTitle() {
			return driver.getTitle();
		}
		
		/**
		 * This method is used to get the page url 
		 * @return current url of the page
		 */
		public String getPageUrl() {
			return driver.getCurrentUrl();
		}
		
		/**
		 * This method is used to quit the browser 
		 * @return
		 */
		public void quitBrowser() {
			driver.quit();
		}
		/**
		 * This method is used to close the browser 
		 * @return
		 */
		public void closeBrowser() {
			driver.close(); 
		}

}
