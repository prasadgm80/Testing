package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class secondTest {
	
	@Test(enabled = false)
	public void test3() {
		System.out.println("Carloan Approved by Web");
		
	}
	
	@Test(groups= {"Smoke"})
	public void test4() {
		System.out.println("Carloan Approved by Mobile");

	}
	
	@Test(groups= {"Smoke"})
	public void test5() {
		System.out.println("Carloan Approved by API");
}
	@BeforeTest
	public void test10(){
		System.out.println("This test will run first");
		
}
	
	@AfterTest
	public void test11() {
		System.out.println("This test will run Last");
}
}
