package testNgSessions;

import org.testng.annotations.Test;

public class PriorityConcept {
	
	

	@Test(priority = -1)
	public void d_Test() {
		System.out.println("d_test");
	}

	@Test(priority = 3)
	public void e_Test() {
		System.out.println("e_test");
	}

	@Test(priority = 2)
	public void f_Test() {
		System.out.println("f_test");
	}

	@Test
	public void a_Test() {
		System.out.println("a_test");
	}

	@Test
	public void b_Test() {
		System.out.println("b_test");
	}

	@Test
	public void c_Test() {
		System.out.println("c_test");
	}
}
