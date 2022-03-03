package webAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckboxField {
	
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\chromedriver.exe");
				
				 driver=new ChromeDriver();

	}
	@Test
	public void checkboxValidation() {
		
		driver.findElement(By.xpath("//i[@class='tree-indicator glyphicon glyphicon-chevron-down']/following::a[2]")).click();
		
	}
	
	@AfterClass
	public void closeAllOpentabs() {
		driver.quit();
		System.out.println("Driver Closed Successfully");
	}
}

