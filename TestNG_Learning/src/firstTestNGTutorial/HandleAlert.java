package firstTestNGTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleAlert {
	
	@Test
	public void handleAlert() throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("toPlaceName")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
	System.out.println(driver.switchTo().alert().getText());
		
		driver.quit();
	}
	
	

}
