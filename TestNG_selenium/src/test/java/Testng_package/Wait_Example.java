package Testng_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Wait_Example {
	WebDriver driver;
	@BeforeClass
	  public void beforeClass() throws InterruptedException {
//		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         }
  @Test
	public void openpage() throws InterruptedException
	{ 
	  driver = new FirefoxDriver();
	  driver.get("https://www.flipkart.com/"); 
	  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle,"Title validation fail");
	  Thread.sleep(3000);
	  System.out.println("Flipkart - Thread ID : "+ Thread.currentThread().getId());
	  driver.close();
	 }
  }
