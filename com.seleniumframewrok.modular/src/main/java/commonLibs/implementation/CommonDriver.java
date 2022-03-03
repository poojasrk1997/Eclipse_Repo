package commonLibs.implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonDriver {
	
	private WebDriver driver;
	private int pageLoadTimeout;
	private int elementDetectionTimeout;
	
	public CommonDriver(String browsername) throws Exception
	{
		pageLoadTimeout=10;
		elementDetectionTimeout=10;
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else 
		{
			throw new Exception("Invalid browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}
	
	public void launchURL(String URL)
	{
		driver.manage().timeouts().pageLoadTimeout(pageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(elementDetectionTimeout, TimeUnit.SECONDS);
		
		driver.get(URL);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setPageLoadTimeout(int pageLoadTimeout) {
		this.pageLoadTimeout = pageLoadTimeout;
	}

	public void setElementDetectionTimeout(int elementDetectionTimeout) {
		this.elementDetectionTimeout = elementDetectionTimeout;
	}
	
	public String getTitleOfPage()
	{
		return driver.getTitle();
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}

	
	}
