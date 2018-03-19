package testNG;

import org.testng.annotations.Test;

public class UnderstandingOfTestNGPriority {


	@Test (priority = -3, dependsOnMethods = "a")
	public void d() {
		System.out.println("d method");
	}

	@Test (priority =-1)
	public void a() {
		System.out.println("a method");
	}

	@Test
	public void b() {
		System.out.println("b method");
	}

	@Test
	public void c() {
		System.out.println("c method");
	}


}
