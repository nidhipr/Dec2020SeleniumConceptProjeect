package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoEcommAppTest {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		String UrlName=br.getPageUrl();
		System.out.println("Url displayed : " +UrlName);
		String logintitle= br.getPageTitle();
		System.out.println("Title of the page "+logintitle);
		
		//By locator :OR
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginButton = By.xpath("//*[@id=\'content\']/div/div[2]/div/form/input");
		By headingName = By.linkText("Your Store");
		
		
		ElementUtil eu = new ElementUtil(driver);
		eu.doSendKeys(email ,"rumjhum17ster@gmail.com");
		eu.doSendKeys(password, "India@123");
		eu.doClick(loginButton);
		String Accttitle= br.getPageTitle();
		System.out.println("Title of the page "+Accttitle);
		if(Accttitle.equals("My Account")) {
			System.out.println("correct url displayed");
		}
		else {
			System.out.println("Wrong Account title");
		}
		if(eu.doIsDisplayed(headingName)) {
			String header=eu.doGetText(headingName);
			System.out.println(header);
		}
		
		br.closeBrowser();
		
		
		
		

	}

}
