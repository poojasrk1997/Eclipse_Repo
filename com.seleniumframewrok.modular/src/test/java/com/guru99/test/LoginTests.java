package com.guru99.test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class LoginTests extends BaseTests{
	
	@Parameters({"username","password"})
	@Test
	public void verifyLoginWithCorrectCredentials(String username, String password)
	{
		
		reportUtils.createTestCase("verify Login With Correct Credentials");
		reportUtils.addTestLog(Status.INFO, "Performing Login functionality");
		lpg.loginpageLogic(username, password);
		String expectedtitle="Guru99 Bank Manager 1 HomePage";
		String actualtitle=cmd.getTitleOfPage();
		
		reportUtils.addTestLog(Status.INFO, "Comparing actual and expected title");
		Assert.assertEquals(actualtitle, expectedtitle);
		
	}

}
