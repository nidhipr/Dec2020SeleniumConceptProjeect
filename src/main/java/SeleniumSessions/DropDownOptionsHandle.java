package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptionsHandle {
   static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		List<String> indus_List= getDropDownOptionList(industry);
		System.out.println(indus_List.contains("Electronics"));
		
//		Select select = new Select(driver.findElement(industry));
//		List<WebElement> option=select.getOptions();
//		System.out.println(option.size());
//		for(WebElement e: option) {
//			System.out.println(e.getText());
//		}

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static List<String> getDropDownOptionList(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> option=select.getOptions();
		List<String> optionsTextList = new ArrayList<String>();
		System.out.println(option.size());
		for(WebElement e: option) {
			optionsTextList.add(e.getText());
	}
			return optionsTextList;
	}
}
