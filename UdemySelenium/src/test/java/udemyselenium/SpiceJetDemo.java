package udemyselenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetDemo {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", 
				//"C:\\Users\\pkharatm\\Downloads\\SeleniumSetUp\\SeleniumWebDrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		System.out.println("======Browser Started=====");
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//To select radiobutton
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='radio']"));
		
		for (int i=0; i<list.size(); i++)
		{
			WebElement radio=list.get(i);
			String value = radio.getAttribute("value");
			System.out.println(value);
			
			if(value.equalsIgnoreCase("RoundTrip"))
			{

				radio.click();
			}
		}	
		driver.close();
	}
	
	

}
