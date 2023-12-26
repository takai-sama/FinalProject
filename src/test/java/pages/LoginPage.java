package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.utility.driver;
import static helper.utility.randomInput;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


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
    public void inputWrongUsername(String username){
        driver.findElement(userNameText).sendKeys(username);
        System.out.println("username : "+username);
    }
    public void inputWrongPassword(String password){
        driver.findElement(passwordText).sendKeys(password);
        System.out.println("password : "+password);
    }

    public void inputUsername(){
        try {
            driver.findElement(userNameText).sendKeys(randomInput);
            System.out.println("username : "+randomInput);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void inputPassword(){
        try {
            driver.findElement(passwordText).sendKeys(randomInput);
            System.out.println("password : "+randomInput);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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
        w.until(ExpectedConditions.visibilityOfElementLocated(welcomeText));
        String welcome = driver.findElement(welcomeText).getText();
        assertThat(welcome).contains("Welcome");
        System.out.println(welcome);
    }

    public void validateWrongPassword(){
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
        w.until(ExpectedConditions.alertIsPresent());
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        assertThat(alertMessage).contains("User does not exist.");
        driver.switchTo().alert().accept();
    }
}
