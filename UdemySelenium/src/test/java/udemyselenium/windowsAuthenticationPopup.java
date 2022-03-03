package udemyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowsAuthenticationPopup {

	public static void main(String[] args) {
				
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Syntax to handle windows popup authentication by modifying url-> https://username:password@url.com
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.linkText("Basic Auth")).click();
		
		//driver.close();
		

	}

}
