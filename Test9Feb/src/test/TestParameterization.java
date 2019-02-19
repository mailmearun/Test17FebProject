package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterization {
	
	@Test
	@Parameters({"user","password"})
	public void TestCase1(String name, String pass)
	{
		System.out.println("User Name\t"+name);
		System.out.println("Password\t"+pass);
	}

}
