package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinksWithAttribute {

	public static void main(String[] args) {
	//get total links & print href value
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		System.out.println("total links : "+linkList.size());
		
		for(WebElement e : linkList) {
			if(!e.getText().isEmpty()) {
			String url =e.getAttribute("href");
			
			if(url!=null) {
			System.out.println(url);
			}
			}
		}

	}

}
