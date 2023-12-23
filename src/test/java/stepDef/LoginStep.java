package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStep {
    LoginPage loginPage;
    public LoginStep(){
        this.loginPage = new LoginPage();
    }
    @Given("user go to demoblaze url")
    public void userGoTo() {
        loginPage.goToWebsite();
    }

    @And("user navigate to login page")
    public void userNavigateToLoginPage() {
        loginPage.navigateToLoginPage();
    }

    @And("user input username {string} on login form")
    public void userInputUsername(String username) {
        loginPage.inputWrongUsername(username);
    }

    @And("user input password {string} on login form")
    public void userInputPassword(String password) {
        loginPage.inputWrongPassword(password);
    }

    @When("user click button login")
    public void userClickButtonLogin() {
        loginPage.clickLogin();
    }

    @Then("home page is opened and welcome text is displayed")
    public void homePageIsOpenedAndWelcomeTextIsDisplayed() {
        loginPage.validateHomepageOpened();
        loginPage.welcomeText();
    }

    @And("user input username on login form")
    public void userInputUsernameOnLoginForm() {
        loginPage.inputUsername();
    }

    @And("user input password on login form")
    public void userInputPasswordOnLoginForm() {
        loginPage.inputPassword();
    }

    @Then("alert User does not exist is displayed and click ok")
    public void alertUserDoesNotExistIsDisplayedAndClickOk() {
        loginPage.validateWrongPassword();
    }
}
