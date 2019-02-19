package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestParallalExecution {
	
	@Test
	public void TestCase1()
	{
		System.setProperty("webdriver.chrome.driver", "E://Grid//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		Assert.assertTrue(driver.getTitle().contains("Google"), "Title Does not match");
		driver.close();
	}
	@Test
	public void TestCase2()
	{
		System.setProperty("webdriver.chrome.driver", "E://Grid//chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver2.get("https://in.yahoo.com/?p=us");
		Assert.assertTrue(driver2.getTitle().contains("Yahoo"), "Title Does not match");
		driver2.close();
	}
	@Test
	public void TestCase3()
	{
		System.setProperty("webdriver.chrome.driver", "E://Grid//chromedriver.exe");
		WebDriver driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver3.get("https://www.msn.com/en-in/");
		Assert.assertTrue(driver3.getTitle().contains("MSN"), "Title Does not match");
		driver3.close();
	}

}
