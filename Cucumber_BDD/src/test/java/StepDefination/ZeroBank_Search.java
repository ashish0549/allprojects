package StepDefination;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class ZeroBank_Search {

	WebDriver driver;

	@Given("login page should be open in default browser")
	public void login_page_should_be_open_in_default_browser() {
		driver = new FirefoxDriver();
//		driver.get("http://zero.webappsecurity.com/login.html");
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@When("search account in the search bar")
	public void search_account_in_the_search_bar()  throws InterruptedException {
		driver.findElement(By.id("searchTerm")).sendKeys("account");
		driver.findElement(By.cssSelector("button.btn")).click(); 	
		throw new io.cucumber.java.PendingException();
	}

	@And("^click on login button and enter (.*)$")
	public void click_on_login_button_and_enter_username1(String username1) {
		driver.findElement(By.id("signin_button")).click();
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys(username1);
	}

	@And("^add (.*)$")
	public void add_password1(String password1) {
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys(password1);
	}

	@Then("^click on signin button check (.*)$")
	public void click_on_signin_button_check_status(String status) throws InterruptedException {
		driver.findElement(By.name("submit")).click();
		System.out.println("Status of Test:" + status);
		Thread.sleep(2000);	
		driver.quit();
	}

	
}
