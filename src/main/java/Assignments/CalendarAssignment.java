package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarAssignment {
	static WebDriver driver;
	public static void main(String[] args) {
	

		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	        
			driver.findElement(By.id("datepicker")).click();
			
			By monthDatePicker =By.xpath("//div[@class='ui-datepicker-title']");
			String month =driver.findElement(monthDatePicker).getText();
			System.out.println(month);
			while(month.equals("April 2021")) {
				selectDate("20");
			}
				
				 driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			
			
			
			
			
				
			
			}
			
			
		
			
	        
		
		
		public static void selectDate(String day ) {
			driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
		}

	}

  
