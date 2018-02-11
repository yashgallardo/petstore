package SampleTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Acres99signup {

	public static WebDriver driver;
	public WebElement element =null;
	
	
	@BeforeTest
	
	public void launchbrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
	//	driver.manage().window().maximize();
		driver.get("http://www.petstore.com/");
	}
		@Test(enabled=true , priority=1)
	
		public void registration() {
		
		// Click Sign in to ur Account
		driver.findElement(By.id("ctl00_hlLoginMD")).click();
		System.out.println("Click Sing in to ur Account");
		
		//Please click here to create your account
		driver.findElement(By.xpath("//a[contains(text(),'Please click here to create your account')]")).click();
		System.out.println("Please click here to create your account");
		
		// Customer Registration
		// Firstname & Lastname
		driver.findElement(By.id("ctl00__pageBody_FirstNameEdit")).sendKeys("Kodavaluru");
		System.out.println("Firstname");
		driver.findElement(By.id("ctl00__pageBody_LastNameEdit")).sendKeys("Yaswanth");
		System.out.println("Lastname");
		
		//Email confirmation
		driver.findElement(By.id("ctl00__pageBody_EmailEdit")).sendKeys("testmail111111111111111111111111@gmail.com");
		System.out.println("Email");
		driver.findElement(By.id("ctl00__pageBody_ConfirmEmailEdit")).sendKeys("testmail111111111111111111111111@gmail.com");
		System.out.println("Email confirmation");
		
		// Password confirmation
		driver.findElement(By.id("ctl00__pageBody_PasswordEdit")).sendKeys("yanish");
		System.out.println("Password");
		driver.findElement(By.id("ctl00__pageBody_ConfirmPasswordEdit")).sendKeys("yanish");
		System.out.println("Password confirmation");
		
		//Phone
		driver.findElement(By.id("ctl00__pageBody_PhoneEdit")).sendKeys("7989210375");
		System.out.println("Phone");
		
		// address
		driver.findElement(By.id("ctl00__pageBody_AddressCtrl1_Address1Edit")).sendKeys("111111 Omr road");
		System.out.println("address");
		
		//city
		driver.findElement(By.id("ctl00__pageBody_AddressCtrl1_CityEdit")).sendKeys("Chennai");
		System.out.println("city");
		
		//Select state
		driver.findElement(By.id("ctl00__pageBody_AddressCtrl1_StateCodeList")).sendKeys("California");
		
		//zip code
		driver.findElement(By.name("ctl00$_pageBody$AddressCtrl1$ZipEdit")).sendKeys("52852");
		System.out.println("zip code");
		
		//Select country
		Select country = new Select(driver.findElement(By.id("ctl00__pageBody_AddressCtrl1_CountryCodeList")));
		country.selectByValue("US");
		System.out.println("country name");
		
		// submit
		driver.findElement(By.xpath("//input[@class='submitbtn']")).click();
		System.out.println("submit");
		
		// User created
		System.out.println("Successfully new user created ");
		
		//Continue to shopping
		driver.findElement(By.xpath("//a[@class='cart_link']")).click();
		System.out.println("continue");
		}
		
		@Test(enabled=true, priority=2)
		public void search_Add_ValidateCart()
		{
			//Search for Dogs
			driver.findElement(By.id("ctl00_Search_SearchTextMainControl")).sendKeys("Dogs");
			System.out.println("Search for Dogs");
			
			WebElement search = driver.findElement(By.xpath("//input[@type='button'and @value='SEARCH' and @class='searchbutton']"));
			search.click();
			System.out.println("Search for Dogs + Search button");
			
			//Sorting
			Select sort = new Select(driver.findElement(By.id("ctl00__pageBody_ddlSortItemsSLI")));
			sort.selectByValue("price_desc");
			System.out.println("Search for Dogs Sorting");
			
			//Get product name
			String actualProdName= driver.findElement(By.linkText("eCo-Concepts Dog Rustic Lodge Style Dog House - Medium")).getText();
			System.out.println("Dog product name:::"+actualProdName);
			
			//Get product price
			String actualProdPrice =driver.findElement(By.xpath("(//div[@class='search_grid_price']/span)[1]")).getText();
			System.out.println("Product price:::"+actualProdPrice);
			
			// Go To details screen of dogs selection
			driver.findElement(By.xpath("//a[@id='ctl00__pageBody_rptGridViewRowsSLI_ctl00_rptGridViewCellsSLI_ctl00_hlDescription']")).click();
			System.out.println("Details screen");
			
			//Add product to cart
			driver.findElement(By.id("ctl00__pageBody_ibAddToCart")).click();
			System.out.println("Add product to cart");
			
			//Go To cart
			WebElement addcart =driver.findElement(By.xpath("//*[@id='slidingTopTrigger']"));
			addcart.click();
			
			// get ItemCode from cart and verify with prevoius name
			System.out.println("Go To Cart");
			String expectedProdname= driver.findElement(By.linkText("eCo-Concepts Dog Rustic Lodge Style Dog House - Medium")).getText();
			String expectedProdCount=driver.findElement(By.xpath("//div[@class='shopping-cart-table']//input")).getAttribute("value");
			
			System.out.println("Expected Product name is :: "+expectedProdname);
			System.out.println("Expected Product count is :: "+expectedProdCount);
			
			if(actualProdName.equals(expectedProdname) && expectedProdCount.equals("1"))
			{
				System.out.println("Product Name and Count in cart is matched with user added product");
			}else 
			{
				System.out.println("Product name/count is not matched");
			}}
		
			@Test(enabled=true, priority=3)
			public void logout() {
			WebElement logout = driver.findElement(By.id("ctl00_FullCustomerNameControl"));
			Actions action = new Actions(driver);
			action.moveToElement(logout).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
		}
			
@AfterTest
public void closebrowser() {
	driver.close();
	System.out.println("Browser closed.....");
}
}



