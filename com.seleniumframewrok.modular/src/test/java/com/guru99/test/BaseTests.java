package com.guru99.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.Status;
import com.guru99.pages.LoginPage;

import commonLibs.implementation.CommonDriver;
import commonLibs.utils.ConfigUtils;
import commonLibs.utils.ReportUtils;
import commonLibs.utils.ScreenshotsUtils;

public class BaseTests {
	
	//Writing logic of invoking browser and closing the browser
	
	CommonDriver cmd;
	String url;
	WebDriver driver;
	LoginPage lpg;
	
	String configFilename;
	String currentWorkDirectory;
	Properties configProperty;
	
	String reportFileName;
	ReportUtils reportUtils;
	
	ScreenshotsUtils screenshot;
	
	
	@BeforeSuite
	public void preSetUp() throws Exception
	{
		currentWorkDirectory=System.getProperty("user.dir");
		configFilename=currentWorkDirectory + "/config/config.properties";
		reportFileName=currentWorkDirectory + "/reports/guru99TestReport.html";
		configProperty=ConfigUtils.readProperties(configFilename);
		reportUtils=new ReportUtils(reportFileName);
	}
	
	@BeforeClass
	public void invokeBrowser() throws Exception
	{
		url=configProperty.getProperty("baseURL");
		
		String browserType=configProperty.getProperty("browserType");
		
		cmd = new CommonDriver(browserType);
		
		driver=cmd.getDriver();
		
		lpg=new LoginPage(driver);
		
		screenshot = new ScreenshotsUtils(driver);
		
		cmd.launchURL(url);
	}
	
	@AfterMethod
	public void postTestAction(ITestResult result) throws Exception
	{
		String testcasename=result.getName();
		
		long executionTime=System.currentTimeMillis();
		
		String ScreenshotFileName = currentWorkDirectory + "/screenshots/"+ testcasename + executionTime + ".jpeg";
		if(result.getStatus() == ITestResult.FAILURE)
		{
			reportUtils.addTestLog(Status.FAIL, "One or more testcase failed");
			screenshot.captureAndSaveScreenshot(ScreenshotFileName);
			reportUtils.attachScreenshotToReport(ScreenshotFileName);
		}
	}
	@AfterClass
	public void closingBrowser()
	{
		
		cmd.closeBrowser();
		
	}
	@AfterSuite
	public void closeReport()
	{
		reportUtils.flushReport();
	}

}
