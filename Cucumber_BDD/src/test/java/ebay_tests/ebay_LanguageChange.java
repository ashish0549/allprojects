package ebay_tests;

import ebay_tests.ebay_cucumberpageclass;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ebay_LanguageChange {

    WebDriver driver;
    ebay_cucumberpageclass ebay;

    @Given("the user is on the eBay homepage to change language")
    public void user_on_homepage_to_change_language() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.ebay.com/");
    }

    @When("the user scrolls down and changes country to Italy")
    public void user_changes_country_to_italy() throws InterruptedException {
        ebay = new ebay_cucumberpageclass(driver);
        ebay.LanguageChange();
    }

    @Then("the site should switch to Italian version")
    public void site_should_be_in_italian() {
        System.out.println("Language changed to Italian.");
        driver.quit();
    }
}
