package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.utility.driver;
import static helper.utility.randomInput;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SignupPage {
    By signButton1 = By.id("signin2");
    By signUsernameText = By.id("sign-username");
    By signPasswordText = By.id("sign-password");
    By signButton2 = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");


    public void navigateToSignupPage(){
        driver.findElement(signButton1).click();
    }
    public void inputUsername(){
        try {
            driver.findElement(signUsernameText).sendKeys(randomInput);
            System.out.println("Username : "+randomInput);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void inputExistUsername(String username){
        driver.findElement(signUsernameText).sendKeys(username);
        System.out.println("Username : "+username);
    }
    public void inputPassword(){
        try {
            driver.findElement(signPasswordText).sendKeys(randomInput);
            System.out.println("password : "+randomInput);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void inputExistPassword(String password){
        driver.findElement(signPasswordText).sendKeys(password);
        System.out.println("password : "+password);
    }
    public void clickSignup(){
        driver.findElement(signButton2).click();
    }

    public void validateSignupSuccessful(){
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
        w.until(ExpectedConditions.alertIsPresent());
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        assertThat(alertMessage).contains("Sign up successful");
        driver.switchTo().alert().accept();
    }
    public void validateIsAccountExist(){
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
        w.until(ExpectedConditions.alertIsPresent());
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        assertThat(alertMessage).contains("This user already exist.");
        driver.switchTo().alert().accept();
    }
}
