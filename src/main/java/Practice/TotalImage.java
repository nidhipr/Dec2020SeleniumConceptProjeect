package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		List<WebElement> totalImage = driver.findElements(By.tagName("img"));
		System.out.println(totalImage.size());
		
		for(WebElement e: totalImage ) {
			System.out.println(e.getAttribute("alt")+" ---->"+e.getAttribute("src"));
		}
		

	}

}
