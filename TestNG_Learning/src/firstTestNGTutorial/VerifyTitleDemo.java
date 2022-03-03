package firstTestNGTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitleDemo {
	
	WebDriver driver;
	
	@Test
	public void pagetitle()
	{
		driver=new ChromeDriver();
		driver.get("https://learn-automation.com/");
		driver.manage().window().maximize();
		
		String Title=driver.getTitle();
		System.out.println("Print the Title "+Title);
		Assert.assertTrue(Title.contains("Automation - Selenium WebDriver tutorial Step by 1"));
		System.out.println("Title verified");
		driver.close();
		
	}
	

}
