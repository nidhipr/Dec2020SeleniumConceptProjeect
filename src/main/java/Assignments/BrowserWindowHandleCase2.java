package Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleCase2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement
		(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
        Set<String> handles1 = driver.getWindowHandles();
        Iterator<String> it1 = handles1.iterator();
		String parentWindowId = it1.next();
		String childWindowId1 = it1.next();
		driver.switchTo().window(childWindowId1);
		String childWindowTitle1 = driver.getTitle();
		System.out.println
		("Title of Linkedin: " + childWindowTitle1);
		driver.close();

		driver.switchTo().window(parentWindowId);
		Thread.sleep(3000);

		driver.findElement
		(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
        Set<String> handles2 = driver.getWindowHandles();
        Iterator<String> it2 = handles2.iterator();
		String parentWindowId2 = it2.next();
		String childWindowId2 = it2.next();
		driver.switchTo().window(childWindowId2);
		String childWindowTitle2 = driver.getTitle();
		System.out.println
		("Title of facebook: " + childWindowTitle2);
		driver.close();

		driver.switchTo().window(parentWindowId2);
		Thread.sleep(3000);
		
		driver.findElement
		(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
        Set<String> handles3 = driver.getWindowHandles();
        Iterator<String> it3 = handles3.iterator();
		String parentWindowId3 = it3.next();
		String childWindowId3 = it3.next();
		driver.switchTo().window(childWindowId3);
		String childWindowTitle3 = driver.getTitle();
		System.out.println
		("Title of twitter: " + childWindowTitle3);
		driver.close();
		

		driver.switchTo().window(parentWindowId3);
		Thread.sleep(3000);

		driver.findElement
		(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
        Set<String> handles4 = driver.getWindowHandles();
        Iterator<String> it4 = handles4.iterator();
		String parentWindowId4 = it4.next();
		String childWindowId4 = it4.next();
		driver.switchTo().window(childWindowId4);
		String childWindowTitle4 = driver.getTitle();
		System.out.println
		("Title of youtube: " + childWindowTitle4);
		driver.close();
		
		driver.switchTo().window(parentWindowId4);
		driver.quit();
		}

}
