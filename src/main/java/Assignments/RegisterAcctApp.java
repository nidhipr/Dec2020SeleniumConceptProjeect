package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAcctApp {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser("chrome");
		br.launchBrowserUrl("https://demo.opencart.com/index.php?route=account/register");

		// By locator:OR
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailId = By.id("input-email");
		By phonenum = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmpassword = By.id("input-confirm");
		By checkbox = By.xpath("//*[@id=\'content\']/form/div/div/input[1]");
		By continueBtn = By.xpath("//*[@id=\'content\']/form/div/div/input[2]");

		ElementUtil eu = new ElementUtil(driver);
		eu.doSendkeys(firstName, "Nidhi");
		eu.doSendkeys(lastName, "Priya");
		eu.doSendkeys(emailId, "nidhi.priya17@gmail.com");
		eu.doSendkeys(phonenum, "9991019");
		eu.doSendkeys(password, "Selenium@123");
		eu.doSendkeys(confirmpassword, "Selenium@123");
		eu.doClick(checkbox);
		eu.doClick(continueBtn);

		br.closeBrowser();

	}

}
