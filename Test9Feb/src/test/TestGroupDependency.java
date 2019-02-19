package test;

import org.testng.annotations.Test;

public class TestGroupDependency {
	
	@Test(dependsOnGroups = { "group1","group2" })
	public void TestCase1()
	{
		System.out.println("Test Case 1");
	}
	@Test (groups = {"group1", "group2"})
	public void TestCase2()
	{
		System.out.println("Test Case with group group1 & group2");
	}
	@Test (groups = {"group1"})
	public void TestCase3()
	{
		System.out.println("Test Case with group group1");
	}
	@Test (groups = {"group2"})
	public void TestCase4()
	{
		System.out.println("Test Case with group group2");
	}

}
