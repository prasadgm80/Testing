package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class firstTest {
	
	@Test(groups= {"Smoke"})
	public void test1() {
		System.out.println("Hello");
		Assert.assertTrue(false);
		}
	
	@Parameters({"URL"})
	@Test 
	//(dependsOnMethods = {"test1"})
	
	public void test2(String urlname) {
		
		System.out.println("Bye");
		System.out.println(urlname);
		
	}
	
	@AfterSuite
	public void test13() {
		System.out.println("I am no 1 from last");
	}
	
	@BeforeMethod
	public void test14() {
		System.out.println("I will execute Before each method");
	}
	
	@BeforeClass
	public void test16() {
		System.out.println("This test will run before all methods in class");
	}
	
	@AfterClass
	public void test17() {
		System.out.println("This test will run after all methods in class");
}
	
	@Test(dataProvider = "getdata")
	public void test18(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "Firstusername";
		data[0][1] = "Firstpassword";
		data[1][0] = "Secondusername";
		data[1][1] = "Secondpassword";
		data[2][0] = "Thirdusername";
		data[2][1] = "Thirdpassword";
		return data;
		
	}
	
}




