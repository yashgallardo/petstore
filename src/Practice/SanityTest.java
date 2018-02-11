package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class SanityTest {


	public static void main (String [] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "E:\\BrowserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=zZGSWfSZKPHx8Afb-LWYAg&gws_rd=ssl");
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		Thread.sleep(2000);
		//driver.close();
		//WebElement state = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div[2]/div/form/table/tbody/tr[4]/td[2]/select"));
		//new Select(state).selectByVisibleText("Texas");
		//boolean 
		WebElement Gmail = driver.findElement(By.linkText("Gmail"));
		Gmail.click();
	//	driver.findElement(By.linkText("Gmail")).click();
		Url = driver.getCurrentUrl();
		System.out.println(Url);
		String WindowHandle = driver.getWindowHandle();
		
		System.out.println(WindowHandle);
		Thread.sleep(2000);
		driver.navigate().back();
		driver.close();
		}
	}

