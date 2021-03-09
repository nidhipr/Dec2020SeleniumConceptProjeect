package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleWithListCase1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		Set<String>handles = driver.getWindowHandles();
		
		List<String> handleList=new ArrayList<String>(handles);
		
		String parentWindowId = handleList.get(0);
		String childWindowId1 = handleList.get(1);
		String childWindowId2 = handleList.get(2);
		String childWindowId3 = handleList.get(3);
		String childWindowId4 = handleList.get(4);
		
		driver.switchTo().window(childWindowId1);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(childWindowId2);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(childWindowId3);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(childWindowId4);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		driver.close();


	}

}
