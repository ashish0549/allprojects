package SeleniumDemo;
import org.openqa.selenium.*;
import org.openqa.selenium.safari.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
public class First_script {
	public static void main(String[] args ) throws InterruptedException
	{
		System.out.println("This is my First Script");
		//setup browser(Chrome driver, firefox driver)
		//System.setProperty("webdriver.chrome.driver","/Users/sai/Desktop/Nasir/Wipro/Selenium_jar/chromedriver-mac-arm64/chromedriver")
		
		//create object for Browser
		WebDriver driver=new ChromeDriver();
		try{
			
			//Set WebApplication URL
		
		driver.get("https://www.selenium.dev");
	
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.close();
		System.out.println("Page Successfully opened");
		}
		catch(Exception e) {
			System.out.println("Unable to open URL");
		}
	}

}
