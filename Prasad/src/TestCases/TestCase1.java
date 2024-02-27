package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.RediffLoginPage;

public class TestCase1 {

	
	@Test
	public void Test1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPage rd = new RediffLoginPage(driver);
		
		rd.emailid().sendKeys("xyz@rediff.com");
		rd.password().sendKeys("abcd");
		rd.proceed().click();
	}	

		@Test 
		public void Test2()
		{ 
			System.out.println("A is running"); 
		Assert.assertTrue(2 > 3); 
		System.out.println("B is running"); 
		}
		
		
	
/*	@Test (enabled = false, alwaysRun = true)
		public void Test3()
		{
			int a = 10;
			int b = 99;
			String c = "EY";
					
					System.out.println(a + b + c);
					System.out.println(a + c + b);
					}
*/				
		}
	


