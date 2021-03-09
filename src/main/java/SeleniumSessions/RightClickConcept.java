package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClick=driver.findElement(By.className("context-menu-one"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightClick).perform();
		List<WebElement> rightOptions = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//span"));
		System.out.println("total no.of right options: "+rightOptions.size());
		
		for(WebElement e : rightOptions) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Copy")) {
				e.click();
				break;
				
			}
			
			
			
		}
		driver.switchTo().alert().accept();

	}

}
