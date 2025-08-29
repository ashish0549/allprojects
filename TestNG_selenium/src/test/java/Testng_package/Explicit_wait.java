package Testng_package;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Explicit_wait {
	
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
		  
//	      driver = new ChromeDriver();
//	      driver.get("https://www.amazon.in/"); 
//	      WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
//	      WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login")));
//	      user.sendKeys("username");
//	      driver.close();
//		  

		driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(10))
				  .pollingEvery(Duration.ofSeconds(2))
				  .ignoring(NoSuchElementException.class);
		  
		  WebElement user = wait.until(new Function<WebDriver, WebElement>(){
			  public WebElement apply(WebDriver driver) {
				  return driver.findElement(By.id("user_login"));
			  }
		  });
	  
	  
	  
	  
	  }
}