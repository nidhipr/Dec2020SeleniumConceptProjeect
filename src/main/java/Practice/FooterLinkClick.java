package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinkClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		List<WebElement> footerLinks = driver.findElements(By.xpath("//ul[@class='footer-nav']/li"));
		System.out.println(footerLinks.size());
		for(int i =0;i<footerLinks.size();i++) {
			System.out.println(footerLinks.get(i).getText());
			driver.close();
		}
		

	}

}
