package Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleCase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement
		(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		driver.findElement
		(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		
		driver.findElement
		(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		
		driver.findElement
		(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		Set<String>handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId= it.next();

		String childWindowId1=it.next();
		driver.switchTo().window(childWindowId1);
		String urlChildWindow1= driver.getCurrentUrl();
		System.out.println
		("url of first child window:" +urlChildWindow1);
		driver.close();
		Thread.sleep(3000);
		
		String childWindowId2=it.next();
		driver.switchTo().window(childWindowId2);
		String urlChildWindow2= driver.getCurrentUrl();
		System.out.println
		("url of first child window:" +urlChildWindow2);
		driver.close();
		Thread.sleep(3000);
		
		String childWindowId3=it.next();
		driver.switchTo().window(childWindowId3);
		String urlChildWindow3= driver.getCurrentUrl();
		System.out.println
		("url of first child window:" +urlChildWindow3);
		driver.close();
		Thread.sleep(3000);
		
		String childWindowId4=it.next();
		driver.switchTo().window(childWindowId4);
		String urlChildWindow4= driver.getCurrentUrl();
		System.out.println
		("url of first child window:" +urlChildWindow4);
		driver.close();
		Thread.sleep(3000);
		
		driver.switchTo().window(parentWindowId);
		String urlParentWindow= driver.getCurrentUrl();
		System.out.println
		("url of parent window:" +urlParentWindow);
		driver.close();
		
		 

	}

}
