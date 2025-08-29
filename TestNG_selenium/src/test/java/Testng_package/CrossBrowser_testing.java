package Testng_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;



public class CrossBrowser_testing {
	WebDriver driver;
	@BeforeClass
	  public void beforeClass() throws InterruptedException {
//		driver = new ChromeDriver();
		Thread.sleep(3000);
//        driver.manage().window().maximize();
         }
	@Test
	public void chrome() throws InterruptedException
	  {
		  driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/"); 
		  String expectedurl="https://www.amazon.in/";
		  String actualurl=driver.getCurrentUrl();
		  Assert.assertEquals(actualurl, expectedurl,"Url validation fail");
		  Thread.sleep(3000);
		  System.out.println("Amazon - Thread ID : "+ Thread.currentThread().getId());
		
		  
		  
	  }
	@Test
	public void firefox() throws InterruptedException
	{ 
	  driver = new FirefoxDriver();
	  driver.get("https://www.flipkart.com/"); 
	  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle,"Title validation fail");
	  Thread.sleep(3000);
	  System.out.println("Flipkart - Thread ID : "+ Thread.currentThread().getId());
	  
  }
	
@AfterMethod
public void aftermethod() throws InterruptedException{
Thread.sleep(2000);	
driver.quit();
}
}

