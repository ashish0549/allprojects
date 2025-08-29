package SeleniumDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.interactions.Actions;

public class DemoQA_Actions {
public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/buttons");
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//    	JavascriptExecutor jse= (JavascriptExecutor)driver;
//    	
//    	WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
//    	Actions act= new Actions(driver);
//    	act.doubleClick(doubleclick).perform();
//    	Thread.sleep (3000);
//    	WebElement rightclick=driver.findElement(By.id("doubleClickBtn"));
//    	act.contextClick(rightclick).perform();
    	
    	
         driver.get("https://demoqa.com/droppable");
         driver.manage().window().maximize();
         Actions act =new Actions(driver);
         WebElement source=driver.findElement(By.id("droppable"));
         WebElement target=driver.findElement(By.id("droppable"));
         act.dragAndDrop(source, target).perform();
         	
   }
}