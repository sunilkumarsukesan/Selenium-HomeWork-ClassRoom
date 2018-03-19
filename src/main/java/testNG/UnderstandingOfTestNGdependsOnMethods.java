package testNG;

import org.testng.annotations.Test;

public class UnderstandingOfTestNGdependsOnMethods {

	@Test
	public void a() {
		System.out.println("a method");
	}

	@Test (dependsOnMethods = {"c"})
	public void b() {
		System.out.println("b method");
	}
	
	@Test (dependsOnMethods = {"a"})
	public void c() {
		System.out.println("c method");
	}
	
	@Test
	public void d() {
		System.out.println("d method");
	}

}
