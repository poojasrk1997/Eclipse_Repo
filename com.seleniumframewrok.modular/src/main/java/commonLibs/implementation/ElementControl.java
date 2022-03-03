package commonLibs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementControl {
	
	WebDriver driver;
	
	public ElementControl(WebDriver driver) 
	{
		
		this.driver=driver;
		
	}
	public void click(WebElement element)
	{
		element.click();
		
	}
	public void setText(WebElement element, String text)
	{
		element.sendKeys(text);
		
	}
	public void clear(WebElement element)
	{
		element.clear();
		
	}

	public boolean IsDiplayed(WebElement element)
	{
		return element.isDisplayed();
	}
	
	public boolean Isselected(WebElement element)
	{
		return element.isSelected();
	}
	
	public void AcceptAlert()
	{
		driver.switchTo().alert().accept();
		
	}
	
	public String getTextFromAlert(WebElement element)
	{
		return driver.switchTo().alert().getText();
	}
	
	public void selectValueFromDropdown(WebElement element, String text)
	{
		Select s=new Select(element);
		s.selectByValue(text);
		
	}
	
	}