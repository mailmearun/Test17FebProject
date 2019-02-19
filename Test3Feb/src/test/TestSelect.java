package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestSelect {

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
		
		//Enter User Name
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Test");
		//Select User Role
		Select user = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		user.selectByVisibleText("Admin");
		Thread.sleep(8000);
		System.out.println(user.isMultiple());
		//user.deselectByVisibleText("Admin");
		//Enter Emp Name
		driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Test Employee");
		//Select Status
		Select emp = new Select(driver.findElement(By.id("searchSystemUser_status")));
		emp.selectByVisibleText("Enabled");
		Thread.sleep(8000);
		//emp.deselectByVisibleText("Enabled");
		//fruits.selectByVisibleText("Banana");
		//fruits.selectByIndex(1);
		//fruits.selectByValue("Banana");
		
		//fruits.selectByVisibleText("Banana");
		//fruits.selectByIndex(1);
		//fruits.selectByValue("Banana");
		
		//fruits.isMultiple(); //Userd to check if multiselect is allowed
		//fruits.deselectAll();

	}

}
