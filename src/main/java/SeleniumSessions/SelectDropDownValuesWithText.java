package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownValuesWithText {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		doSelectByTextOption(industry,"Healthcare");
		
		}

	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectByTextOption(By locator,String text) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionList=select.getOptions();
		
		for(WebElement e: optionList) {
			if(e.getText().equals(text));
			e.click();
			break;	
	}

}}
