package firstTestNGTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserDemo {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifytitle(String browsername)
	{
		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.get("https://learn-automation.com");
		System.out.println(driver.getTitle());
		driver.quit();
			
		
	}
}
