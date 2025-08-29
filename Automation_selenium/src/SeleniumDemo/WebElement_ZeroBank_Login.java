package SeleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_ZeroBank_Login {
	public static void loginStep (WebDriver driver, String user1, String pass1, String testexecution) throws InterruptedException
	{
		System.out.println("Manual Test--> "+testexecution);
		WebElement user=driver. findElement(By.id("user_login")) ;
//		 user.click();
		user .sendKeys(user1);
		
		// locating password text field
		WebElement pass=driver. findElement(By.id ("user_password"));
//      user.click();	
		pass.sendKeys (pass1);
		
		// click on signin button
		driver. findElement (By.name ("submit")).click();
		Thread.sleep(5000);
		
	}
	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver=new ChromeDriver);
		WebDriver driver=new ChromeDriver();
		driver.get ("http://zero.webappsecurity.com/login.html");
		System.out.println("Welcome to Zero bank Login page");
		
		loginStep(driver, "865645", "password", "Unable to login");
		loginStep(driver, "username", "98786745", "Unable to login");
		loginStep(driver, "8656jhfjd", "ngdj56465", "Unable to login");
		loginStep(driver,"","", "Unable to login");
		loginStep(driver,"username","password","user is able to login successfully");
		
       }
}