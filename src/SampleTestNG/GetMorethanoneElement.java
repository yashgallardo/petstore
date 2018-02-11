package SampleTestNG;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetMorethanoneElement {
	public WebDriver driver;
	@BeforeMethod
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		// Here we are forcefully passing wrong id so that it will fail our testcase
		driver.findElement(By.xpath("//*[@id=\"u_0_l\"]")).sendKeys("Learn Automation");
	}
// It will execute after every test execution 
@AfterMethod
public void teardown(ITestResult result)
{
 
// Here will compare if test is failing then only it will enter into if condition
if(ITestResult.FAILURE==result.getStatus())
{
try 
{
// Create refernce of TakesScreenshot
TakesScreenshot ts=(TakesScreenshot)driver;
 
// Call method to capture screenshot
File source=ts.getScreenshotAs(OutputType.FILE);
 
// Copy files to specific location here it will save all screenshot in our project home directory and
// result.getName() will return name of test case so that screenshot name will be same
FileUtils.copyFile(source, new File("./Screenshots/"+result.getName()+".png"));
 
System.out.println("Screenshot taken");
} 
catch (Exception e)
{
 
System.out.println("Exception while taking screenshot "+e.getMessage());
} 
 
 
 
}
// close application
driver.quit();
}
	}


