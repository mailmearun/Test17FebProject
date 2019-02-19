package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssert {
	
	@Test
	public void TestCase()
	{
		System.out.println("First TestNG Test");
		
		Assert.assertTrue(false);
		
		System.out.println("After Assert");
	}
	
	@Test
	public void TestCase2()
	{
		System.out.println("First Test 2");
		
		SoftAssert s = new SoftAssert();
		
		s.assertFalse(true);
		System.out.println("After Soft Assert");
		s.assertFalse(false);
		System.out.println("After Soft Assert");
		s.assertAll();
	}

}
