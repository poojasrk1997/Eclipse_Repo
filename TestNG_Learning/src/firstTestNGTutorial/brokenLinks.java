package firstTestNGTutorial;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class brokenLinks {
	
	@Test
	public void brokenLink() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int count=links.size();
		for(int i=0;i<count; i++)
		{
			WebElement ele=links.get(i);
			String url=ele.getAttribute("href");
			verifybrokenLink(url);
		}
		
	}
	@Test
	public void verifybrokenLink(String linkUrl) throws Exception
	{
		URL url=new URL(linkUrl);
		HttpURLConnection conn=(HttpURLConnection)url.openConnection();
		conn.setConnectTimeout(3000);
		conn.connect();
		if(conn.getResponseCode()==200)
        {
            System.out.println(linkUrl+" - "+conn.getResponseMessage());
         }
       if(conn.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
        {
            System.out.println(linkUrl+" - "+conn.getResponseMessage() + " - "+ conn.HTTP_NOT_FOUND);
         }
	}

}
