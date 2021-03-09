package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(5000);
		List<WebElement> searchList = 
				driver.findElements(By.xpath("//*[@id='index']/div[2]/ul/li"));

		System.out.println(searchList.size());
		for (WebElement e : searchList) {
			System.out.println(e.getText());
			if (e.getText().equals("T-shirts > Faded Short Sleeve T-shirts")) {
				e.click();
				break;
			}
		}
		Thread.sleep(3000);
		String dressName = driver.findElement
				(By.xpath("//h1[@itemprop='name']")).getText();
		if (dressName.contains("Faded Short Sleeve")) {
			System.out.println("Correct name displayed");
		} else
			System.out.println("Name is not correct");

	}

}
