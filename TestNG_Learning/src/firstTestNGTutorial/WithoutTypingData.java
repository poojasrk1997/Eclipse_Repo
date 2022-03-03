package firstTestNGTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WithoutTypingData {
	
	@Test
	public void TestData()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele=driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value='abc@gmail.com'", ele);
		
		WebElement click=driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", click);
	}

}
