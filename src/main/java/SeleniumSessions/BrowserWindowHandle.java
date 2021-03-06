package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parent window id : "+parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child window id : " +childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("Child window title: "+driver.getTitle());
        
        driver.close();
        
        driver.switchTo().window(parentWindowId);
        System.out.println("Parent window title: "+driver.getTitle());
        
        driver.quit();
        
	}

}
	