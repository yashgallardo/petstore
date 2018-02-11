package SampleTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestNGpractice1 {
@Test
public void openbrowser() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\BrowserDrivers\\chromedriver.exe");

	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Select select = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
	List<WebElement> list = select.getOptions();
	
	for (WebElement we: list) {
		System.out.println(we.getText());
		
		Thread.sleep(2000);
		driver.close();
		
	}
	
	
}}







	