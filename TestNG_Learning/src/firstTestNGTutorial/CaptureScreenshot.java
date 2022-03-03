package firstTestNGTutorial;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import library.Utility;


public class CaptureScreenshot {
	
	@Test
	public void captureScreenshot() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Utility.takeScreenshot(driver, "Browser Open1");
		driver.findElement(By.id("email")).sendKeys("POOJA");
		Utility.takeScreenshot(driver, "Entered Email1");
		driver.quit();
		
		
		
	}

}
