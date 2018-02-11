package SampleTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestNGPractice2 {

	public static WebDriver driver;
public static void main (String args[]) {
	
	
		System.setProperty("webdriver.chrome.driver", "E:\\BrowserDrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		Select dropdown= new Select(driver.findElement(By.id("month")));
//		dropdown.selectByVisibleText("Jun");
//		String str = dropdown.getFirstSelectedOption().getText();
//		System.out.println(str);
//		//driver.close();
//		driver.navigate().refresh();
		
		String arr[]= {"Month", "Jan", "Feb", "Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
		Select select=new Select(driver.findElement(By.id("month")));
		List<WebElement> listdropdown= select.getOptions();
		System.out.println(listdropdown.size());
		for (int i=0;i<listdropdown.size();i++) 
		{
			Assert.assertEquals(arr[i], listdropdown.get(i).getText());
			System.out.println(listdropdown.get(i).getText());
		}
		driver.close();
	}

}
