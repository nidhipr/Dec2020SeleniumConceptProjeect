package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleWithListCase2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
        Set<String> handles1 = driver.getWindowHandles();
        List<String> handleList=new ArrayList<String>(handles1);

		String parentWindowId = handleList.get(0);
		String childWindowId1 = handleList.get(1);
        driver.switchTo().window(childWindowId1);
		String childWindowTitle1 = driver.getTitle();
		System.out.println("Title of Linkedin: " + childWindowTitle1);
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
        Set<String> handles2 = driver.getWindowHandles();
        List<String> handleList2=new ArrayList<String>(handles2);

		String parentWindowId2 = handleList2.get(0);
		String childWindowId2 = handleList2.get(1);
        driver.switchTo().window(childWindowId2);
		String childWindowTitle2 = driver.getTitle();
		System.out.println("Title of Facebook: " + childWindowTitle2);
		driver.close();
		
		driver.switchTo().window(parentWindowId2);
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
        Set<String> handles3 = driver.getWindowHandles();
        List<String> handleList3=new ArrayList<String>(handles3);

		String parentWindowId3 = handleList3.get(0);
		String childWindowId3 = handleList3.get(1);
        driver.switchTo().window(childWindowId3);
		String childWindowTitle3 = driver.getTitle();
		System.out.println("Title of twitter: " + childWindowTitle3);
		driver.close();
		
		driver.switchTo().window(parentWindowId3);
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
        Set<String> handles4 = driver.getWindowHandles();
        
        List<String> handleList4=new ArrayList<String>(handles4);

		String parentWindowId4 = handleList4.get(0);
		String childWindowId4 = handleList4.get(1);
        driver.switchTo().window(childWindowId4);
		String childWindowTitle4 = driver.getTitle();
		System.out.println("Title of youTube: " + childWindowTitle4);
		driver.close();
		
		driver.switchTo().window(parentWindowId4);
		driver.quit();
	}

}
