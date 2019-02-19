package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "E://Grid//chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println(driver.getTitle());
		
		//Enter Username and Password
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//Use of ID
		driver.findElement(By.id("btnLogin")).click();
		
		//Click using Link Text
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//driver.findElement(By.partialLinkText("OrangeHRM")).click();
		
		//Xpath
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
