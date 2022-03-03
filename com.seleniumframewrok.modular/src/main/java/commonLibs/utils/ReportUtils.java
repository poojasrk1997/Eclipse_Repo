package commonLibs.utils;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportUtils {
	
	ExtentHtmlReporter htmlReport;
	ExtentReports extentReports;
	ExtentTest extentTest;
	
	public ReportUtils(String htmlReportFilename) {
		
		htmlReportFilename=htmlReportFilename.trim();
		
		htmlReport=new ExtentHtmlReporter(htmlReportFilename);
		
		extentReports=new ExtentReports();
		
		extentReports.attachReporter(htmlReport);
		
	}
	
	public void createTestCase(String testcasename)
	{
		extentTest = extentReports.createTest(testcasename);
		
	}
	
	public void addTestLog(Status status, String comment)
	{
		extentTest.log(status, comment);
		
	}
	
	public void attachScreenshotToReport(String Filename) throws Exception
	{
		extentTest.addScreenCaptureFromPath(Filename);
	}
	
	public void flushReport()
	{
		extentReports.flush();
	}
	

}
