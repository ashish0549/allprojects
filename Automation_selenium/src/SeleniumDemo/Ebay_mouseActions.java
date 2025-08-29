package SeleniumDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.interactions.Actions;

public class Ebay_mouseActions {
     public static void main(String[] args) throws InterruptedException 
     {
        
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    	JavascriptExecutor jse= (JavascriptExecutor)driver;
    	
    	Actions act = new Actions(driver);
    	WebElement motors = driver.findElement (By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
    	act.moveToElement(motors).perform();
    	
    	Thread.sleep (3000);
    	
    	WebElement sports = driver.findElement (By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[7]/a"));
    	act.moveToElement(sports).perform();
    	Thread.sleep (3000);
    	
    	WebElement fashion= driver.findElement (By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/a"));
    	act.moveToElement(fashion).perform();
    	
    }

}
