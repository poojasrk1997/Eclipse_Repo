package firstTestNGTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyErrorDemo {
	
	WebDriver driver;
	
	@Test
	public void verifyerror()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierNext")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String actualerror=driver.findElement(By.xpath("//*[@class='o6cuMc']")).getText();
		String expectederror="Enter an email or phone number";
		Assert.assertEquals(actualerror, expectederror);
		System.out.println("Error msg matched");
		driver.close();
	
	}

}
