package SeleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OrangeHRM_Login_Test {

    public static void login(WebDriver driver, String username, String password, String testCaseDescription) throws InterruptedException {
        System.out.println("Executing Test Case: " + testCaseDescription);

        // Navigate to login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Wait for page to load elements
        Thread.sleep(3000);

        // Locate username and password fields and login button
        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));

        // Clear existing values
        usernameField.clear();
        passwordField.clear();

        // Enter credentials
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);

        // Click login
        loginBtn.click();

        // Wait for response
        Thread.sleep(4000);

        // Check login result
        try {
            // Check if dashboard is loaded
            driver.findElement(By.xpath("//h6[text()='Dashboard']"));
            System.out.println("✅ Login successful - " + testCaseDescription);
        } catch (Exception e) {
            System.out.println("❌ Login failed - " + testCaseDescription);
        }

        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();

        // List of test cases: [username, password, description]
        List<String[]> loginTests = Arrays.asList(
                new String[]{"Admin", "wrongpass", "Invalid password"},
                new String[]{"WrongUser", "admin123", "Invalid username"},
                new String[]{"", "admin123", "Empty username"},
                new String[]{"Admin", "", "Empty password"},
                new String[]{"", "", "Both fields empty"},
                new String[]{"Admin", "admin123", "Valid credentials - should login successfully"}
        );

        for (String[] test : loginTests) {
            login(driver, test[0], test[1], test[2]);
        }

        // Close browser
        driver.quit();
    }
}
