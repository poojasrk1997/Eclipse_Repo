package omayoSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class omayoDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Open url
		driver.get("http://omayo.blogspot.com/");
		//driver.navigate().to("http://omayo.blogspot.com/");
		
		//Alert
		driver.findElement(By.id("alert1")).click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(a.getText());
		a.accept();
		
		//Search
		
		
		
		
		
		driver.close();

	}

}
