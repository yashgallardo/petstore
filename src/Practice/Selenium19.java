package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium19 {

	public static void main (String [] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\BrowserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.navigate().to("https://www.naukri.com/browse-jobs");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		/*driver.manage().window().maximize();
		System.out.println("Window is maximized");
			String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
	
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
	
		String WindowHandle = driver.getWindowHandle();
		System.out.println(WindowHandle);*/
		
		driver.close();
	}
	
}
