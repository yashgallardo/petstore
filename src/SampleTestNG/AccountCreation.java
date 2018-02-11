package SampleTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AccountCreation {

	public WebDriver driver;
	@Test
	public void openbrowser() throws InterruptedException {
		
		
		
		System.setProperty("webdriver.gecko.driver", "E:\\BrowserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.healthcarevolunteer.com/volunteers/register.php");
		
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("yash.skoda@gmail.com");
		
		driver.findElement(By.name("lastname")).sendKeys("yash.skoda@gmail.com");
		
		WebElement state = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div[2]/div/form/table/tbody/tr[4]/td[2]/select"));
		
		new Select(state).selectByVisibleText("Texas");
		
		
		//new Select(state).selectByIndex(4);
		//new Select(state).selectByValue("Texas");
		WebElement CountryofResidence = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div[2]/div/form/table/tbody/tr[5]/td[2]/select"));
		new Select(CountryofResidence).selectByVisibleText("United States");
		WebElement Checkbox = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div[2]/div/form/table/tbody/tr[15]/td/input"));
		Thread.sleep(5000);
		if (Checkbox.isSelected()) {
			System.out.println("Already Selected");
		}	
		else
		{ Checkbox.click();
		
		}
		Thread.sleep(3000);
		
		WebElement Join = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div[2]/div/form/table/tbody/tr[18]/td[2]/input"));Join.click();
		WebElement header = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div[2]/div/span[1]"));
		String pageheader= header.getText();
		if (pageheader.contains("Create an Account")) {
			System.out.println("Correct page is displayed");
		}
		else System.out.println("Incorrect page is displayed");
		}
	
	
}


	
	

