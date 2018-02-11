package Practice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium19B {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "E:\\BrowserDrivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.healthcarevolunteer.com/");
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		WebElement menuElement = driver.findElement(By.linkText("Volunteers"));
		builder.moveToElement(menuElement).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();
		
		Thread.sleep(2000);
driver.close();
	}

}
