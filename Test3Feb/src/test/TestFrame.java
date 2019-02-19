package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFrame {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "E://Grid//chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		System.out.println(driver.getTitle());
		
		
		driver.switchTo().frame(driver.findElement(By.id("IF1")));
		
		//Normal Selenium Commands
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("IFrame Test");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		

	}

}
