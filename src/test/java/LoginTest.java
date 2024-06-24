package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set the path to your WebDriver executable
//        System.setProperty("webdriver.chrome.driver", "home/mefathim/chromedriver-linux64");
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
    }

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
//        loginPage.setUsername("testuser");
//        loginPage.setPassword("password");
//        loginPage.clickLoginButton();

        // Add assertions here to verify login success
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
