package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E://Grid//chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com");
		System.out.println(driver.getTitle());
		
		//Taking Screenshot
		File srcfile=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File destfile=new File("E:/ScreenshotTest3Feb.jpg");
		FileUtils.copyFile(srcfile,destfile);

	}

}
