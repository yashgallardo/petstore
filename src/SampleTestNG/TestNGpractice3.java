package SampleTestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestNGpractice3 {
	public WebDriver driver;
@Test
public void openbrowser() throws InterruptedException, IOException {
	System.setProperty("webdriver.gecko.driver", "E:\\BrowserDrivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.navigate().to("http://www.healthcarevolunteer.com/");
	//driver.manage().window().maximize();
	
	
	Thread.sleep(3000);
	//driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li[2]/a")).click();
	//File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(screenshot, new File("D:\\screenshots\\JoinNow1.jpg"));
	//Thread.sleep(5000);
//	System.out.println("Successful join screenshot");
	//driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li[2]/ul/li[1]/a")).click();
	Thread.sleep(3000);
	
	//File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(screenshot, new File("D:\\screenshots\\My Account1.jpg"));
	//Thread.sleep(3000);
	//System.out.println("Successful My screenshot");
	driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/ul/form/li[2]/input")).sendKeys("Yashwanth@gmail.com");
	Thread.sleep(2000);
	WebElement pass = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/ul/form/li[3]/input"));pass.sendKeys("Yashwanth");
		Thread.sleep(2000);
		WebElement Login = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/ul/form/li[4]/button"));Login.click();
		Thread.sleep(2000);
		int totallinks = driver.findElements(By.xpath("//a")).size();
		System.out.println("total no.of links"+totallinks);
		File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1, new File("D:\\screenshots\\My Account1.jpg"));
		driver.quit();
		}
}
