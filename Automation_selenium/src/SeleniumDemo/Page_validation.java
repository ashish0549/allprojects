package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_validation {
	public static void main(String[] args ) throws InterruptedException
	{
		System.out.println("This is Page Validation Script");
		//setup browser(Chrome driver, firefox driver)
		//System.setProperty("webdriver.chrome.driver","/Users/sai/Desktop/Nasir/Wipro/Selenium_jar/chromedriver-mac-arm64/chromedriver")
		
		//create object for Browser
		WebDriver driver=new ChromeDriver();
//		try{
			
			//Set WebApplication URL
		
		driver.get("https://www.selenium.dev/");
		String ExpectedURL ="https://www.selenium.dev/";
		String ActualURL = driver.getCurrentUrl();
//		driver.manage().window().maximize();
//		Thread.sleep(4000);
		System.out.println("Expected URL : "+ ExpectedURL);
		System.out.println("Actual URL : "+ ActualURL);
		if(ExpectedURL.equals(ActualURL))
		{
			System.out.println("URL Validation Successfull");
			
		}
		else 
		{
			System.out.println("URL Validation Failed");
		}
		driver.close();
		System.out.println("Page Successfully opened");
		}
//		catch(Exception e) {
//			System.out.println("Unable to open URL");
//		}
//	}

}

