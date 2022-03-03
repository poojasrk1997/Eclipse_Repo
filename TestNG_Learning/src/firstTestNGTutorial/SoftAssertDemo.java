package firstTestNGTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
	@Test
	public void testsoftassert()
	{
		SoftAssert a=new SoftAssert();
		System.out.println("Testsoft started");
		a.assertEquals(false, true, "Values not matching");
		System.out.println("Testsoft completed");
		a.assertAll();
	}
	
	@Test
	public void testhardassert()
	{
		
		System.out.println("Testhard started");
		Assert.assertEquals(false, true, "Values not matching");
		System.out.println("Testhard completed");
		
	}


}
