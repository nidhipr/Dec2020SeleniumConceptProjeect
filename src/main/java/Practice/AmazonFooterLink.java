package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonFooterLink {
//display total footerlinks on the page
	//display footer text on the page
	//display total image onn the page
	//display the utl of the image
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement>  amazonFooterLinks = 
				driver.findElements(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//li"));
		System.out.println(amazonFooterLinks.size());
		for(WebElement e : amazonFooterLinks) {
			System.out.println(e.getText());
		}
		



	}

}
