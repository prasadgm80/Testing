package AutomationLearning.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.sun.xml.bind.v2.schemagen.xmlschema.ExtensionType;

public class ExtentReportDemo {
	ExtentReports extent;
	
	@BeforeTest
	public void Config() {
		//ExtentReports and ExtentSparkReporter
		
		String Path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(Path);
		reporter.config().setReportName("Web Automation Report");  //sets report name
		reporter.config().setDocumentTitle("Automation Results");  // sets title
		
		 extent = new ExtentReports();
		extent.attachReporter(reporter);
				
		extent.setSystemInfo("Tester", "Praad");
		
	}
	
	@Test
	public void Demo1() {
		extent.createTest("Demo1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/#/index");
		driver.getTitle();
		
		extent.flush();
		
		
	}

}
