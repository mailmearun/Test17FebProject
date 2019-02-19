package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBrowser {

	public static void main(String[] args) {
		WebDriver driver=null;
		String browser = "FF";
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E://Grid//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver","E://Grid//IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(browser.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "E://Grid//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Check Browser Name");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());

	}

}
