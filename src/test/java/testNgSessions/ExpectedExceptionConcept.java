package testNgSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name ="Tom";
	
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void loginTest() {
		System.out.println("login to app");
		int i =9/3;
		ExpectedExceptionConcept obj =null;
		System.out.println(obj.name);
	}
}
