package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("nidhi priya");
		Thread.sleep(3000);
		List<WebElement> suggestList =
				driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		System.out.println(suggestList.size());
		for(WebElement e: suggestList) {
			if(e.getText().equals("nidhi priya linkedin")) {
				e.click();
				break;
			}
		}
		
	}

}
