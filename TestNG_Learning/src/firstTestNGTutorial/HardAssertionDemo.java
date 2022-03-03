package firstTestNGTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo {
	
	@Test
	public void test1()
	{
		System.out.println("Test started");
		Assert.assertEquals(true, false,"Values are not matching");
		String str="Anil";
		Assert.assertTrue(str.contains("Anil"),"Values matched");
		System.out.println("Test complted");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test started");
		String str="Pooja";
		Assert.assertTrue(str.contains("Pooja"),"Values matched");
		System.out.println("Test complted");
	}

}
