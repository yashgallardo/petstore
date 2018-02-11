package SampleTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	
		
		
		public static WebDriver driver;
		
		public static void main(String[] args) {
			
				
			System.setProperty("webdriver.gecko.driver", "E:\\BrowserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("yash.skoda@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("yashsrav");
		
		driver.findElement(By.id("u_0_2")).click();
		
		
		

	}

}
