package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWindows {

	public static void main(String[] args) {
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "E://Grid//chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
				
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//get address of parent window
		String Parent = driver.getWindowHandle();
		System.out.println("Address of Parent window "+Parent);
		
		//get the address of child window
		Set<String> Child = driver.getWindowHandles();
		System.out.println("Total windows "+Child.size());
		for(String handle: driver.getWindowHandles())
		{
			System.out.println(handle);
			driver.switchTo().window(handle);
			if(handle.matches(Parent))
			{
				driver.close();
			}
		}

		

	}

}
