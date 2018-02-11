package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Mozilladriver {
	
	String driverPath = "<path to gecko driver executable>";
	public WebDriver driver;
	
	@Test
	public void launchBrowser() {
		System.out.println("launching firefox browser"); 
		System.setProperty("webdriver.gecko.driver", "E:\\BrowserDrivers"+"\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void openApplication() {
		driver.navigate().to("http://www.google.com");
	}
	
}
