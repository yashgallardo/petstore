package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium19A {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\BrowserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		//driver.findElement(By.id("identifierId")).sendKeys("yashsuma.aim");
		//driver.findElement(By.name("identifier")).sendKeys("yashsuma.aim");
		//driver.findElement(By.tagName("input")).sendKeys("yashsuma.aim");
		//driver.findElement(By.cssSelector("#identifierId")).sendKeys("yashsuma.aim");
		/*driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[1]/div[1]/div/div[1]/div/div[1]/input")).sendKeys("yashsuma.aim");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[1]/div[1]/div/div[1]/div/div[1]/input")).clear();
		Thread.sleep(1000);
		driver.findElement(By.name("identifier")).getAttribute("type");
		System.out.println("Type of Email");*/
		
		WebElement Email =  driver.findElement(By.name("identifier"));
		Email.sendKeys("yashsuma.aim");
		Thread.sleep(1000);
		
		//Email.clear();
		//Thread.sleep(1000);
		
		Email.getAttribute("type");
		Thread.sleep(1000);
		
		/*Email.getText();
		System.out.println(Email.getText());*/
		Thread.sleep(1000);
		
		System.out.println(Email.isSelected());
		System.out.println(Email.isDisplayed());
		
		
		
		driver.close();
		
		
	}

}
