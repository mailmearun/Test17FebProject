package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridTest {
	
		@Test
		public void TestCase1() throws MalformedURLException
		{
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "E://Grid//chromedriver.exe");
			DesiredCapabilities capability = DesiredCapabilities.chrome();
	        capability.setBrowserName("chrome");
	        capability.setPlatform(Platform.WIN10);
	        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.google.co.in/");
			Assert.assertTrue(driver.getTitle().contains("Google"), "Title Does not match");
			driver.close();
		}
		
		@Test
		public void TestCase2() throws MalformedURLException
		{
			WebDriver driver2;
			System.setProperty("webdriver.chrome.driver", "E://Grid//chromedriver.exe");
			DesiredCapabilities capability = DesiredCapabilities.chrome();
	        capability.setBrowserName("chrome");
	        capability.setPlatform(Platform.WIN10);
	        driver2 = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
			driver2.manage().window().maximize();
			driver2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver2.get("https://opensource-demo.orangehrmlive.com/");
			Assert.assertTrue(driver2.getTitle().contains("Orange"), "Title Does not match");
			driver2.close();
		}
}
