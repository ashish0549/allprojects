package SeleniumDemo;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class CssDemoQA {
	public static void main(String[] args) throws InterruptedException,IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep (2000) ;
		
		driver.manage().window().maximize();
		
//		JavascriptExecutor jse= (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,400)");
		WebElement fname=driver.findElement(By.cssSelector ("div›input [placeholder=\"First Name\"]"));
		
		fname.sendKeys ("Neeva");
		
		WebElement lname=driver. findElement (By.cssSelector("div›input[placeholder=\"Last Name\"]"));
		lname.sendKeys("Sharma");
		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.cssSelector("select›option [value=\"2025\"]")).click();
		driver.findElement(By.cssSelector("select›option[value=\"3\"]")).click();
		driver.findElement(By.cssSelector("div[aria-label=\"Choose Tuesday, April 1st,2025\"]")).click();

   }
	
}
