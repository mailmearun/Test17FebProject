package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActions {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E://Grid//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		System.out.println(driver.getTitle());
		
		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//strong[text()='Link Test']"));
		WebElement target = driver.findElement(By.xpath("//input[@name='firstname']"));
		//action.dragAndDrop(source, target).build().perform();
		action.moveToElement(target).build().perform();
	}

}
