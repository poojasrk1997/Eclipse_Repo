package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookTags {
	
	@Before("@Smoke")
	public void setup_browser(Scenario sc)
	{
		System.out.println("Lanuch the browser");
		System.out.println(sc.getName());
	}
	
	@After()
	public void teardown_close(Scenario sc)
	{
		System.out.println("Close the browser");
		System.out.println(sc.getName());
	}
}
/*	@Before(order=2)
	public void setup_app()
	{
		System.out.println("Lanuch the application");
	}
	@After(order=2)
	public void teardown_logout()
	{
		System.out.println("logout from application");
	}
	
		
	}
	@After(order=3)
	public void teardown()
	{
		System.out.println("windows closed");
	}
	@BeforeStep
	public void takeScreenshot()
	{
	System.out.println("Take screenshot after each step");	
	}
	@AfterStep
	public void refreshPage()
	{
		System.out.println("Refresh the page after each step");
	}*/



