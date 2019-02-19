package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCheckBox {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "E://Grid//chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		//Login
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//Print the Title after login
		System.out.println(driver.getTitle());
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		//Using Actions Class for Mouse move
		WebElement UserManagement = driver.findElement(By.id("menu_admin_UserManagement"));
		
		new Actions(driver).moveToElement(UserManagement).perform();
		
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		//Click on first CheckBox
		driver.findElement(By.id("ohrmList_chkSelectRecord_6")).sendKeys(Keys.SPACE);
		Thread.sleep(5000);

	}

}
