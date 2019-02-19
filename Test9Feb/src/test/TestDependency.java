package test;

import org.testng.annotations.Test;

public class TestDependency {
	
	@Test
	public void TestCase1()
	{
		System.out.println("Test Case 1");
	}
	@Test 
	public void TestCase2()
	{
		System.out.println("Test Case 2");
	}
	@Test (dependsOnMethods = { "TestCase1","TestCase2" })
	public void TestCase3()
	{
		System.out.println("Test Case 3 Depends on Test Case 1 Executed");
	}

}
