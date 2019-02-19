package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
	
	@DataProvider(name="Credentials")
	public static Object[][] TestData()
	{
		return new Object[][]{{12,"Pass1"},{13,"Pass2"},{13,"Pass2"}};
	}
	
	@Test(dataProvider="Credentials")
	public void TestCase(int user, String pass)
	{
		System.out.println("UserName\t"+user);
		System.out.println("PassName\t"+pass);
	}

}
