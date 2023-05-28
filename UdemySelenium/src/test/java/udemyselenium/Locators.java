package udemyselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		System.out.println("======Browser Started=====");
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		
		/*driver.findElement(By.name("first_name")).sendKeys("Pooja");
		driver.findElement(By.name("last_name")).sendKeys("Kharatmol");
		driver.findElement(By.name("business_name")).sendKeys("PK");*/
		
		String findelement= driver.findElement(By.name("email")).getText();
		
		List<WebElement> link = driver.findElements(By.xpath("//*[@id='rso']/div/div/div/h3/a"));
		
		for(WebElement element: link)
		{
		System.out.println(element.getText());
		}
		
		driver.findElement(By.xpath("//*[@id='rso']/div/div/div/h3/a")).click();
		
		//driver.close();
		
		
		
	}

}
