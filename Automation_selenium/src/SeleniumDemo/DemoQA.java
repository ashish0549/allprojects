package SeleniumDemo;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class DemoQA {
	public static void main(String[] args) throws InterruptedException,IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep (2000) ;
		
		driver.manage().window().maximize();
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
		
		
	 
		WebElement fname=driver.findElement(By.id("firstName")) ;
		fname.sendKeys("Nasir") ;
		WebElement Iname=driver.findElement(By.id("lastName" ));
		Iname. sendKeys ("Guduru");
		WebElement email=driver.findElement(By.id("userEmail"));
		email. sendKeys("nasirhussain@gmail.com");
	
		
		// x.path by auto selecting(means we select just by clicking right click on that and copy its X path
//		driver. findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
        
		// x.path manually after using cmd+f use this is syntax  "//label[@for='gender-radio-1']"
		driver. findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		
		WebElement mobileno=driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobileno. sendKeys("9618214212");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement year=driver.findElement (By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select sel=new Select (year);
//		// sel. selectByIndex(125);// 2025
//		// sel. selectByValue("2025");
		sel.selectByVisibleText("2025");
//		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select sell=new Select (month);
//		//sel1. selectByValue("0");// January
//		// sel1. selectByIndex (1) ;
		sell.selectByVisibleText ("July");
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]")).click();
 
		//Entering each sub 1 by 1
//		WebElement sub=driver.findElement(By.id("subjectsInput"));
//		sub.sendKeys("Maths");
//		sub.sendKeys(Keys.ENTER);
//		sub.sendKeys("Phy");
//		sub.sendKeys(Keys.ENTER);
		
		//Entering Each sub using loop
		String[] subjects= {"Math", "phy", "Eco", "Eng" };
		WebElement sub=driver. findElement (By. id ("subjectsInput"));
		for (String subject: subjects)
		{
		sub. sendKeys (subject) ; sub. sendKeys (Keys. ENTER);
		
		}
		
		//Hobbies
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
		
		
		jse.executeScript("window.scrollBy(0,400)");
		
		
		//upload Picture
		WebElement img=driver. findElement (By. id ("uploadPicture"));
		img.sendKeys("/Users/sai/Desktop/Wallpapers/DBZ.jpg");
		
		
		//Select State
		WebElement state=driver.findElement(By.id("react-select-3-input"));
		
		state.sendKeys("NCR");
		state.sendKeys(Keys.ENTER);
		
		// select city
        WebElement city=driver.findElement(By.id("react-select-4-input"));
		city.sendKeys("Delhi");
		city.sendKeys(Keys.ENTER);
		
		//submit clicking
		 driver.findElement(By.id("submit")).click();
	     Thread.sleep(2000);
	     File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest=new File("screenshotDemoQA.png");
		 Files.copy(src.toPath(), dest.toPath(),StandardCopyOption.COPY_ATTRIBUTES);
	     
		 System.out.println("screeshot named 'screenshotDemoQA' saved successfully to src folder of this path");
	     
	}
}
