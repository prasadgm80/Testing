import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demp_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	 Class name= ChromeDriver,
	 *  X driver= New X();
	 */
				 
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Documents\\Exams\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");  //navigates the url
		System.out.println(driver.getTitle());  //prints the title of url
		
		System.out.println(driver.getCurrentUrl()); //validates that same url is used
		
		//System.out.println(driver.getPageSource()); //prints page source
		
		driver.navigate().to("https://yahoo.com"); //navigates from google to yahoo
		
		//driver.navigate().back();  //navigates from yahoo back to google
		//driver.navigate().forward(); //navigates forward
		//driver.close();   //closes current browser
		driver.quit();  // closes all browsers opened by selenium
		
	}

}
