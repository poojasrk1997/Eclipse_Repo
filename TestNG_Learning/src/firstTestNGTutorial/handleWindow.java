package firstTestNGTutorial;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handleWindow {
	
	@Test
	public void HandleWindow()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.name("link1")).click();
		
		Set<String> allwindow=driver.getWindowHandles();
		int count=allwindow.size();
		System.out.println(count);
		
		for(String child:allwindow)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("New data");
				driver.close();
			}
		}
		driver.switchTo().window(parent);

	}

}
