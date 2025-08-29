package SeleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA_Alerts {
	 public static void main(String[] args) throws InterruptedException {
	        
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demoqa.com/alerts");
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	    	JavascriptExecutor jse= (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,400)");
			
			WebElement samplealert=driver.findElement(By.id("alertButton")); 
			samplealert.click();
			Thread. sleep(4000) ;
			Alert alert=driver.switchTo() .alert(); alert.accept();
			
			
			WebElement timealert=driver.findElement(By.id("timerAlertButton")); 
			timealert.click();
			Thread. sleep(7000);
			Alert alert12=driver.switchTo().alert(); alert12.accept();
			Thread. sleep (3000);
			
			WebElement confirmalert=driver.findElement(By.id("confirmButton")); 
			confirmalert.click();
			Thread.sleep(4000);
			Alert alert1=driver.switchTo().alert(); alert1.dismiss();
			Thread. sleep(3000);
			
			WebElement promptalert=driver.findElement(By.id("promtButton"));
			promptalert.click();
			Thread.sleep(4000);
			Alert alert11=driver.switchTo().alert(); alert1.dismiss();
			Thread. sleep(3000);
			alert11.sendKeys("Nasir");
			alert11.accept();
			

 }
}