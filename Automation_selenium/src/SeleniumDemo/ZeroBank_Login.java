package SeleniumDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank_Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Welcome to Zero bank Login page");
		
		{
			System.out.println("Manual test::-->Check user is unable to login with "
					+ "invalid username and valid password credentials");
		}
		//locating username text field
		
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("8875675");
		// locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		// click on signin button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(6000);
		System.out.println("Login unsuccessfully");
		
		{
			System.out.println("Manual test::-->Check user is unable to login with "
					+ "valid username and invalid password credentials");
		}
		//locating username text field
		//driver.get("http://zero.webappsecurity.com/login.html");
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		// locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("jhal86765");
		
		// click on signin button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(6000);
		System.out.println("Login unsuccessfully");
		
		{
			System.out.println("Manual test::-->Check user is unable to login with "
					+ "invalid username and invalid password credentials");
		}
		//locating username text field
		//driver.get("http://zero.webappsecurity.com/login.html");
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("8875675");
		// locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("987534");
		
		// click on signin button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(6000);
		System.out.println("Login unsuccessfully");
		
		{
			System.out.println("Manual test::-->Check user is unable to login with null credentials");
		}
		//locating username text field
		//driver.get("http://zero.webappsecurity.com/login.html");
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("");
		// locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("");
		
		// click on signin button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(6000);
		System.out.println("Login unsuccessfully");
		{
			System.out.println("Manual test::-->Check user is able to login with "
					+ "valid username and valid password ");
		}
		//locating username text field
		//driver.get("http://zero.webappsecurity.com/login.html");
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		// locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		// click on signin button
		driver.findElement(By.name("submit")).click();
		//driver.findElement(By.id("logout_link"));
		System.out.println("Login successfully");
		
		driver.close();
		
 
	}
 
}