package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "E://Grid//chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		System.out.println(driver.getTitle());
		
		
		//driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
		
		driver.findElement(By.xpath("//button[text()='Prompt Pop up']")).click();
		
		//Alert
		String Alert = driver.switchTo().alert().getText();
		System.out.println(Alert);
		driver.switchTo().alert().sendKeys("Yes");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

	}

}
