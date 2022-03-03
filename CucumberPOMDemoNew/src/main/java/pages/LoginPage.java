package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{

	
	private WebDriver driver;
	
	//By locators (Object Repository) :
	private By username = By.id("email");
	private By password = By.id("passwd");
	private By login = By.id("SubmitLogin");
	private By ForgotPwdLink = By.linkText("Forgot your password?");
	
	//Constructor of page class:
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Page actions: Feature / Behaviour of the page in the form of method
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean isLostYourPwdLink()
	{
		return driver.findElement(ForgotPwdLink).isDisplayed();
	}
	
	public void enteruserName(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickOnLogin()
	{
		driver.findElement(login).click();
	}
}
