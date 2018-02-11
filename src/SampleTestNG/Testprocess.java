package SampleTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testprocess {
	public static WebDriver driver;
	@Test
	public void openbrowser() throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver", "E:\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement Firstname = driver.findElement(By.name("firstname"));
		Firstname.sendKeys("Yashwanth");
		System.out.println("Firstname : ");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jun");
		String str = month.getFirstSelectedOption().getText();
		System.out.println(str);
		Thread.sleep(3000);
		
		Select dropdownlist = new Select(driver.findElement(By.id("month")));
		
		List<WebElement> list = dropdownlist.getOptions();
		for (WebElement we: list) {
			System.out.println(we.getText());
		}
		
		driver.close();
		//Select month1= new Select(driver.findElement(By.id("month")));
		//month1.getFirstSelectedOption();
		
		
		
		
		
		
		
		
	}
}
