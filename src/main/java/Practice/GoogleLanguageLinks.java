package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		List<WebElement> googleLang=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(googleLang.size());
		for(WebElement e : googleLang) {
			String text = e.getText();
			
			if(text.equals("मराठी"	
					e.click();
				break;
			}
		}

	}

}



