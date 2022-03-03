package udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class diffmethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\pkharatm\\Downloads\\SeleniumSetUp\\SeleniumWebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("======Browser Started=====");
		
		//driver.get("https://www.google.com/");
		//driver.navigate().to("https://www.google.com/");
		//System.out.println(driver.getPageSource());
		//driver.navigate().forward();

		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		Actions a=new Actions(driver);
		
		WebElement search=driver.findElement(By.cssSelector(".gLFyf.gsfi"));
		
		a.moveToElement(search).click().sendKeys("pooja").sendKeys(Keys.chord(Keys.ENTER)).build().perform();
		
		driver.navigate().back();
	
		driver.close();
		
		System.out.println("======Browser Closed=====");
		
		

	}

}
