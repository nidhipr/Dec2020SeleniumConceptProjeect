package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinksWithAttribute {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
		System.out.println(totalLinks.size());
		for(WebElement e: totalLinks) {
			String url = e.getAttribute("href");
			if(!url.isEmpty()) {
				System.out.println(url);
			}
		}

	}

}
