package testNgSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGAnnotations {
	/**
	 * BS---create user
       BT---connection with DB
       BC---launch browser
       
       BM---login
            add to cart---t1
       AM---logout
       
       BM---login
       payment----t2
       AM---logout
       
       BM---login
       search test
       AM---logout
       
AC---close browser
AT---close DB
AS---delete the user
	 * 
	 */
	
	@BeforeSuite
	public void createUser() {
		System.out.println("BS---create user");
	}
	
	@BeforeTest
	public void connectwithDB() {
		System.out.println("BT---connection with DB");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC---launch browser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("BM---login");
	}
	
	@Test
	public void searchTest() {
		System.out.println("search test");
	}
	
	@Test
	public void addToCartTest() {
		System.out.println("add to cart");
	}
	
	@Test
	public void paymentTest() {
		System.out.println("payment");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM---logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC---close browser");
	}
	
	@AfterTest
	public void disconnectWithDB() {
		System.out.println("AT---close DB");
	}
	
	@AfterSuite
	public void deletetheUser() {
   System.out.println("AS---delete the user");
}
}
