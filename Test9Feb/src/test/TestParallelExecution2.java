package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(test.TestListeners.class)

public class TestParallelExecution2 {
	
public WebDriver driver;
	
	@BeforeTest
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "E://Grid//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterTest
	public void Clean()
	{
		driver.close();
	}
	
	@Test
	public void TestCase1()
	{
		driver.get("https://www.google.co.in/");
		Assert.assertTrue(driver.getTitle().contains("Google"), "Title Does not match");
	}
	@Test
	public void TestCase2()
	{
		driver.get("https://www.google.co.in/");
		Assert.assertTrue(driver.getTitle().contains("google"), "Title Does not match");
	}
	@Test (enabled = false)
	public void TestCase3()
	{
		driver.get("https://www.google.co.in/");
		Assert.assertTrue(driver.getTitle().contains("Google"), "Title Does not match");
	}

}
