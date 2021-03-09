package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		List<WebElement> footerLinks=
				driver.findElements(By.xpath("//ul[@class='footer-nav']/li"));
		System.out.println("Total footer links on the page: "+footerLinks.size());
		/*for(WebElement e: footerLinks) {
			System.out.println(e.getText());
		}*/

	}

}
