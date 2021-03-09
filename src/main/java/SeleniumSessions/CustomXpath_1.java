package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		//xpath is a locator
		//it is used to find the address of an element in the dom.
		// 2 types xpath : 
		//a.Absolute xpath - absolute address of the element
		//html/body/div[2]/div[1]/ul[1]/ul[3]/li
		//b.Relative or custom xpath
		//htmltag[@attribute='value]
		//input[@name='username']
		
		//htmltag[@attribute1='value and @attri2='value']
		//button[@data-test-id='password-login-button']
		
		//	
		//htmltag[@attribute1='value and @attri2='value' and attr3='value']
		///button[@data-test-id='password-login-button' and @id='loginBtn' and @aria-disabled='true']

		//id= 'test_123'
		//id='test_234'
		//id='test_334'
		//For dynamic xpath we have to use contains()
		//htmltag[contains(@id,'test_')];
		
		//htmltag[contains(@id,'value') and @name='value']	
		
		//By search = By.className("search_query form-control ac_input");--Not correct
		//By search = By.xpath("//input[@class='search_query form-control ac_input']");
		By search = By.className("search_query"); 
		driver.findElement(search).sendKeys("dresses");
		
		
		//text() as function
		//htmltag[text()='value']
		//h2[text()='Refreshing business software that your teams will love']
		
		//htmltag[text()='value' and @attr='value']
		
		//text()with contains()
		
		//htmltag[contains(text(),'value')]
		//h2[contains(text(),'Refreshing')]
		
		
		//indexing
	//	(//htmltag[@attri='value'])[1]
		//(//htmltag[@attri='value'])[position()=1]
		//(//htmltag[@attri='value'])[last()]
		
		//starts-with
		//input[starts-with(@id,'user')]-this is used when id is dynamic
		
		
	}
	

}
