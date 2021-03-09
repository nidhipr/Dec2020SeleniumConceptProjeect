package testNgSessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
@Test
public void registerTest() {
	System.out.println("register test");
}
	
	@Test
	public void loginTest() {
		System.out.println("login to app");
	}
	@Test(dependsOnMethods = {"loginTest","registerTest"},priority = 1)
	public void searchTest() {
		System.out.println("search test");
	}
	
	@Test(dependsOnMethods = "loginTest",priority = 2)
	public void paymentTest() {
		System.out.println("payment to app");
	}
}
