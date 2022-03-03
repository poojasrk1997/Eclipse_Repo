package webAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import library.Utility;

public class InputSimpleForm {
	
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\chromedriver.exe");
				
				 driver=new ChromeDriver();
}
	
	@Test
	public void inputForm() throws Exception {
		
				driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
				
				driver.manage().window().maximize();
		
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
				driver.findElement(By.id("at-cv-lightbox-close")).click();
				
				driver.findElement(By.id("user-message")).sendKeys("My name is pooja");
				
				Utility.takeScreenshot(driver, "Enter msg");
				
				driver.findElement(By.xpath("//button[text()='Show Message']")).click();
				
				String actual_msg=driver.findElement(By.xpath("//span[@id='display']")).getText();
				
				String expected_msg="My name is pooja";
				
				Utility.takeScreenshot(driver, "Verify msg");
				
				Assert.assertEquals(actual_msg, expected_msg);

				System.out.println("Input Form Entered Successfully");
				
	}
	
	@Test
	public void multipleInputFields() {
		WebElement sum1=driver.findElement(By.id("sum1"));
		sum1.sendKeys("4");
		
		WebElement sum2=driver.findElement(By.id("sum2"));
		sum2.sendKeys("4");
		
		driver.findElement(By.xpath("//button[text()='Get Total']")).click();
		String actual_value=driver.findElement(By.id("displayvalue")).getText();
		Assert.assertTrue(actual_value.contains("8"));
		
		System.out.println("Multiple Input Fields Validated");
		
	}
	
	@AfterClass
	public void closeAllOpentabs() {
		driver.quit();
		System.out.println("Driver Closed Successfully");
	}
	
}
