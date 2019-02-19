package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void TestCase()
	{
		System.out.println("First TestNG Test");
	}
	@Test
	public void TestCase1()
	{
		System.out.println("First TestNG Test 1");
	}
	@Test
	public void TestCase2()
	{
		System.out.println("First TestNG Test 2");
	}
	
	@BeforeMethod
	public void SetupEnv()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void CleanEnv()
	{
		System.out.println("AfterMethod");
	}
	@BeforeClass
	public void SetupEnv1()
	{
		System.out.println("BeforeClass");
	}
	@AfterClass
	public void CleanEnv1()
	{
		System.out.println("AfterClass");
	}
	@BeforeTest
	public void SetupEnv2()
	{
		System.out.println("BeforeTest");
	}
	@AfterTest
	public void CleanEnv2()
	{
		System.out.println("AfterTest");
	}

}
