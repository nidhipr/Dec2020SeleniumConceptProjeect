package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EcommProductDetails {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=product/product&product_id=41&search=iMac");
		By productName = By.xpath("//h1[text()='iMac']");
		System.out.println(driver.findElement(productName).getText());
		By productList=By.xpath("//h1[text()='iMac']/following-sibling::ul/li");
		List<WebElement> productDetails= driver.findElements(productList);
		for(WebElement e: productDetails) {
			System.out.println(e.getText());
		}
				
		

	}

}
