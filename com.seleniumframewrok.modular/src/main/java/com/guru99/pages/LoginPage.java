package com.guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	@FindBy(name="uid")
	WebElement userid;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement login;
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void loginpageLogic(String username, String Password)
	{
		elementcontrol.setText(userid, username);
		elementcontrol.setText(password, Password);
		elementcontrol.click(login);
	}
	
	

}
