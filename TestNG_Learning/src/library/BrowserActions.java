package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BrowserActions {
	
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser(WebDriver driver) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\chromedriver.exe");
				
				 driver=new ChromeDriver();

}
	
	@AfterClass
	public void closeAllOpentabs() {
		driver.quit();
		System.out.println("Driver Closed Successfully");
	}
}

