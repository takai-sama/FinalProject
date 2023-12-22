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

    @And("user input username {string}")
    public void userInputUsername(String username) {
        loginPage.inputUsername(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        loginPage.inputPassword(password);
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
}
