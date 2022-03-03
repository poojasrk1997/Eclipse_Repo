package library;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void takeScreenshot(WebDriver driver, String ScreenshotName) throws Exception {
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File dummy=ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(dummy, new File("./Screenshots/"+ScreenshotName+".png"));
		System.out.println("Screenshot taken");
	}

}
