package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextFieldElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		By loginLink = By.linkText("Login");
		By regForm = By.xpath("//input[@class='form-control']");
		ElementUtil eu = new ElementUtil(driver);
		List<WebElement> formList=eu.getElements(regForm);
		
		if(eu.doDisplayed(loginLink)) {
			System.out.println("Login link is displayed");
		}
		
		if(eu.getElements(loginLink).size()==1) {
			System.out.println("Login link is displayed");
		}
		
		if(formList.size() ==6) {
			System.out.println("all fields are present");
		}
		
		for(WebElement e : formList) {
			e.sendKeys("testing");
		}
	
	}
	}
