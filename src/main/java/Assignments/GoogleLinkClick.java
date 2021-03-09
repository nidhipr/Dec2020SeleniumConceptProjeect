package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLinkClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incogito");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		List<WebElement> footerLinks = 
				driver.findElements(By.xpath("//span[@id='fsl']/a"));
		for (int i = 0; i < footerLinks.size(); i++) {
			String text = footerLinks.get(i).getText();
			footerLinks.get(i).click();
			System.out.println(text + ": " + driver.getTitle());
			Thread.sleep(3000);
			driver.navigate().back();
			footerLinks = driver.findElements(By.xpath("//span[@id='fsl']/a"));
			driver.close();
		}
	}

}
