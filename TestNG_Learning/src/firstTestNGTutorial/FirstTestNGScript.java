package firstTestNGTutorial;

import org.testng.annotations.Test;

public class FirstTestNGScript {

	@Test(priority=1,description="Login to application")
	public void Logintoapplication()
	{
		System.out.println("Loggedin Successfully");
	}
	
	@Test(priority=2,description="Select the items to add in cart")
	public void SelectItems() 
	{
		System.out.println("Items Selected Successfully");
	}
	
	@Test(priority=3,description="Checkout from the cart after selecteing items")
	public void checkout()
	{
		System.out.println("Checkedout Successfully");
	}
	

}
