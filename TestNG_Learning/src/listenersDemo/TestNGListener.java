package listenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class TestNGListener implements ITestListener{
	
	public void onTestFailure(ITestContext result)
	{
		System.out.println("Test failure "+result.getName());
	}
	public void onTestStarts(ITestContext result)
	{
		System.out.println("Test Start "+result.getName());
	}
	public void onTestSkipped(ITestContext result)
	{
		System.out.println("Test Skipped "+result.getName());
	}
	public void onTestSuccess(ITestContext result)
	{
		System.out.println("Test Success "+result.getName());
	}

}
