package com.guru99.pages;

import org.openqa.selenium.WebDriver;

import commonLibs.implementation.ElementControl;

public class BaseClass {
	
	
	WebDriver driver;
	
	public ElementControl elementcontrol;
	
	public BaseClass(WebDriver driver) {
		this.driver=driver;
		
		elementcontrol=new ElementControl(driver);
	}

}
