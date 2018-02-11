package SampleTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfFrames {


		public static WebDriver driver;
		public static void main (String args[]) {
			System.setProperty("webdriver.chrome.driver", "E:\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https://www.facebook.com/");
		 List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total no frames "+" "+frames.size());
		driver.close();
	}

}
