package pages;

import helper.Endpoint;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.utility.driver;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {
    By loginButton1 = By.id("login2");
    By userNameText = By.id("loginusername");
    By passwordText = By.id("loginpassword");
    By loginButton2 = By.xpath("//*[@onclick = 'logIn()']");
    By welcomeText = By.id("nameofuser");

    public void goToWebsite(){
        driver.get("https://www.demoblaze.com");
    }

    public void navigateToLoginPage(){
        driver.findElement(loginButton1).click();
    }
    public void inputUsername(String username){
        driver.findElement(userNameText).sendKeys(username);
    }
    public void inputPassword(String password){
        driver.findElement(passwordText).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(loginButton2).click();
    }
    public void validateHomepageOpened(){
        String websiteName = driver.findElement(By.id("nava")).getText();
        assertEquals("PRODUCT STORE",websiteName);
    }
    public void welcomeText() {
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
        // presenceOfElementLocated condition
        w.until(ExpectedConditions.visibilityOfElementLocated(welcomeText));
        String welcome = driver.findElement(welcomeText).getText();
        assertThat(welcome).contains("Welcome");
    }
}
