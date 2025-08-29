package Testng_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ebay_miniproject {
	WebDriver driver;
	MiniProjectClass_Ebay mp;
	@BeforeTest 
	public void beforeTest() throws InterruptedException 
	{
		driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Thread.sleep(2000);
	}
	
	@DataProvider(name = "EbayExcelData")
	public Object[][] EbayexcelDataProvider() throws IOException {
		driver.findElement(By.cssSelector(".gh-identity-signed-out-unrecognized > a:nth-child(1)")).click();
	    String excelPath = "/Users/sai/Downloads/EbayLoginData.xlsx";
	    String sheetName = "Sheet1";

	    FileInputStream fis = new FileInputStream(excelPath);
	    Workbook workbook = WorkbookFactory.create(fis);
	    Sheet sheet = workbook.getSheet(sheetName);

	    int rows = sheet.getLastRowNum(); 
	    Object[][] data = new Object[rows][1];

	    for (int i = 1; i <= rows; i++) { 
	        Row row = sheet.getRow(i);
	        if (row == null) {
	            data[i - 1][0] = "";
	            continue;
	        }

	        Cell cell = row.getCell(0);
	        data[i - 1][0] = (cell == null) ? "" : cell.toString().trim();
	    }

	    workbook.close();
	    return data;
	}


	@Test(dataProvider = "EbayExcelData")
	public void testemail(String email) throws InterruptedException {
	    if (email == null || email.trim().isEmpty()) {
	        System.out.println("Skipped test due to empty email");
	        return;
	    }

	    System.out.println("Email: " + email);
	    
	    WebElement clean = driver.findElement(By.id("userid"));
	    clean.clear();
	    clean.sendKeys(email);
	    driver.findElement(By.name("signin-continue-btn")).click();
	    Thread.sleep(2000);
	}



	@DataProvider(name = "EbayExcelData1")
	public Object[][] EbayexcelDataProvider1() throws IOException {
	    String excelPath = "/Users/sai/Downloads/EbayLoginData.xlsx";
	    String sheetName = "Sheet2";

	    FileInputStream fis = new FileInputStream(excelPath);
	    Workbook workbook = WorkbookFactory.create(fis);
	    Sheet sheet = workbook.getSheet(sheetName);

	    int lastRow = sheet.getLastRowNum(); 
	    Object[][] data = new Object[lastRow][1];

	    for (int i = 1; i <= lastRow; i++) { 
	        Row row = sheet.getRow(i);
	        if (row == null) {
	            data[i - 1][0] = "";
	            continue;
	        }

	        Cell cell = row.getCell(0);
	        data[i - 1][0] = (cell == null) ? "" : cell.toString().trim();
	    }

	    workbook.close();
	    return data;
	}


	@Test(dataProvider = "EbayExcelData1")
	public void testpassword(String password) throws InterruptedException {
	    if (password == null || password.trim().isEmpty()) {
	        System.out.println("Skipped test due to empty password");
	        return;
	    }

	    System.out.println("Password: " + password);
	    WebElement passField = driver.findElement(By.id("pass"));
	    passField.click();
	    passField.sendKeys(password);
	    driver.findElement(By.name("sgnBt")).click();
	    Thread.sleep(2000);
	}


	
	@Test(priority = 2) 
	public void ms() throws InterruptedException 
	{
		MiniProjectClass_Ebay mp=new MiniProjectClass_Ebay (driver);
		mp.multipleSearches();
	}
	
	@Test(priority = 3) 
	public void addingtoCartandDelete() throws InterruptedException 
	{
		MiniProjectClass_Ebay mp=new MiniProjectClass_Ebay (driver);
		mp.addToCartandDelete();
	}
	@Test(priority = 4)
	public void changeAandN() throws InterruptedException 
	{
		MiniProjectClass_Ebay mp=new MiniProjectClass_Ebay (driver);
	    mp.changeAddressAndName();
	}
	@Test(priority = 5)
    public void shoppingByCatTest() throws InterruptedException 
	{
		MiniProjectClass_Ebay mp=new MiniProjectClass_Ebay (driver);
    	mp.shopByCatTest();
        
    }
	@Test(priority = 6)
	public void shoppingByallCatTest() throws InterruptedException 
	{
		MiniProjectClass_Ebay mp=new MiniProjectClass_Ebay (driver);
		mp.shopByallCatTest();
	      
	}
	@Test(priority = 7)

	public void languageChange() throws InterruptedException 
	{
		MiniProjectClass_Ebay mp=new MiniProjectClass_Ebay (driver);
		mp.LanguageChange();

    }	
	@AfterTest 
	public void afterTest() {
		driver.quit();
		System.out.println("Browser closed. Test completed.");
	}
	
}


