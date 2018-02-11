package SampleTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	
	public WebDriver driver;
	@BeforeMethod
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.qtptutorial.net/automation-practice/");
	}
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
	@Test (priority = 1)
	public void getalllinks() {
		//all links are associated with tagname a
		int totallinks = driver.findElements(By.tagName("a")).size();
		System.out.println("Total links : : "+ totallinks);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links : : "+ links.size());
	}
		@Test (priority = 2)
		public void getalllinks1() {
		List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Total no.of frames : : "+ totalframes.size());
		
		int totalframes1 = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total no.of frames : : "+ totalframes1);
		}
		@Test (priority = 3)
		public void gettablecount() {
		int totalrows = driver.findElements(By.xpath("//*[@id=\"htmlTableId\"]/tbody/tr")).size();
		int totalcols = driver.findElements(By.xpath("//*[@id=\"htmlTableId\"]/tbody/tr[1]/*")).size();
		System.out.println("Total no.of rows : :"+ totalrows);
		System.out.println("Total no.of cols : :"+ totalcols);
		
			
			for (int i=1; i<=totalrows; i++) {
			for (int j=1; j<=totalcols; j++){
				
		System.out.print(driver.findElement(By.xpath("//*[@id=\"htmlTableId\"]/tbody/tr["+i+"]/*["+j+"]")).getText() + " : :");
				
			}
			System.out.println();
			
			}
			
		}
	@DataProvider (name = "Testdata")
	public String[][] testdata() {
		String [][]inputs = new String[3][2];
		inputs[0][0] = "User1";
		inputs[0][1] = "pass1";
		
		inputs[1][0] = "User2";
		inputs[1][1] = "Pass2";
		
		inputs[2][0] = "user3";
		inputs[2][1] = "pass3";
		return inputs;
	}
	@Test (dataProvider ="Testdata", enabled = false)
	public void login(String username, String password) throws InterruptedException {
	
		driver.findElement(By.id("email")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(1000);
		
	}
	}
	

