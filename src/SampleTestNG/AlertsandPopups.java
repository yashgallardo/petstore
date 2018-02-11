package SampleTestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertsandPopups {
	public WebDriver driver;

	@Test
	public void launchbrowser() {
		
	System.setProperty("webdriver.chrome.driver", "E:\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}	
		@Test
		public void alertBox() throws InterruptedException
		{
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
			driver.switchTo().frame("iframeResult");
			driver.findElement(By.xpath("/html/body/button")).click();
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000);
			al.accept();
			driver.close();
			
		}
		
}