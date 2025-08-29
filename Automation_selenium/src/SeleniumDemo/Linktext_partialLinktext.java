package SeleniumDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_partialLinktext {
	public static void main(String[] args) throws InterruptedException,IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/results?search_query=om+namo+bhagavate+vasudevaya");
		Thread.sleep (2000) ;
		
		driver.manage().window().maximize();
        driver.findElement(By.linkText("Om Namo Bhagavate Vasudevaya")).click();
}
}