package resources;

import com.aventstack.extentreports.ExtentReports;

public class Reports {
	static ExtentReports extent;
	
	public static ExtentReports getReports()
	{
	String Path = System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(Path);
	reporter.config().setReportName("Web Automation Report");  //sets report name
	reporter.config().setDocumentTitle("Automation Results");  // sets title
	
	 extent = new ExtentReports();
	extent.attachReporter(reporter);
			
	extent.setSystemInfo("Tester", "Praad");
	return extent;
	}

}
