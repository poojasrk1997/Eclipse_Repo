package firstTestNGTutorial;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

	
public class Application {
	
	WebDriver driver;
	
	@BeforeClass
	public void browserstart()
	{	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("======Browser Started=====");
	}
	@Test(priority=1)
	public void login()
	{
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		String currentURL=driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("saucedemo"));

		System.out.println("Login to application");
		
	}
	
	@Test(dependsOnMethods = "login")
	public void dashboard() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@id='item_4_title_link']")).click();
		Thread.sleep(2000);
		boolean b=driver.findElement(By.xpath("//*[@class='inventory_details_back_button']")).isDisplayed();
		//boolean b=driver.findElement(By.xpath("//*[@class='product_label']")).isDisplayed(); to fail the testcase provided incorrect button
		Assert.assertTrue(b);
		System.out.println("Dashboard Displayed");
	}
	
	@Test(dependsOnMethods = "dashboard")
	public void Logout()
	{
		driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']")).click();
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		Assert.assertTrue(driver.findElement(By.id("user-name")).isDisplayed());
		System.out.println("Logout to application");
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
		System.out.println("=====Browser Closed=====");
	}

}
