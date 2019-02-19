package test;

import org.testng.annotations.Test;

public class TestPriority {
	
	@Test
	public void TestCase1()
	{
		System.out.println("Test Case 1");
	}
	@Test (groups = {"functional", "regression"})
	public void TestCase2()
	{
		System.out.println("Test Case with group functional & regression");
	}
	@Test (groups = {"functional"})
	public void TestCase3()
	{
		System.out.println("Test Case with group functional");
	}
	@Test (groups = {"regression"})
	public void TestCase4()
	{
		System.out.println("Test Case with group regression");
	}
}
