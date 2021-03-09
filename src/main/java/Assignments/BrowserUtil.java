package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * this class is having different generic method related to browser
 * 
 * @author swarn
 *
 */

public class BrowserUtil {
	WebDriver driver;

	/**
	 * This method is used tio intialize the webdriver on the basis of given browser
	 * name.h
	 * 
	 * @param browserName
	 * @return this method return webdriver reference
	 */
	public WebDriver launchBrowser(String browserName) {

		System.out.println("launching the browser " + browserName);
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "Opera":
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
			break;

		default:
			System.err.println("Pass the correct browser name");
			break;
		}
		return driver;
	}

	/**
	 * This method is used to enter the url in the browser
	 * 
	 * @param url
	 */
	public void launchBrowserUrl(String url) {
		if (url.isEmpty()) {
			System.out.println("url is blank" + url);
			return;
		}
		driver.get(url);
	}

	/**
	 * This method get the url of the page and return String
	 */

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	/**
	 * This method get the title of the page
	 * 
	 * @return this method return String
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}

	/**
	 * this method quit the browser
	 */

	public void quitBrowser() {
		driver.quit();
	}

	/**
	 * this method close the browser
	 */
	public void closeBrowser() {
		driver.close();
	}

}
