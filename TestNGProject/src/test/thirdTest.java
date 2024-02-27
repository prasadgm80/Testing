package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class thirdTest {

	@Test (timeOut = 4000)
	public void test6() {
		System.out.println("Homeloan Approved by Web");
	}
	
	@Test
	public void test7() {
		System.out.println("Homeloan Approved by Mobile");
	}
	
	@Test
	public void test8() {
		System.out.println("Homeloan Approved by API");
	}
	
	@BeforeSuite
	public void test12() {
		System.out.println("I am no 1");
	}
	
	@AfterMethod
	public void test15() {
		System.out.println("I will execute after each method in class file");
	}
}
