package stepDef;

import helper.utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignupPage;

public class SignupStep {
    SignupPage signupPage;
    public SignupStep(){
        this.signupPage = new SignupPage();
    }

    @And("user navigate to signup page")
    public void userNavigateToSignupPage() {
        signupPage.navigateToSignupPage();
    }
    @And("user input username on register form")
    public void userInputUsername() {
        signupPage.inputUsername();
    }
    @And("user input password on register form")
    public void userInputPassword() {
        signupPage.inputPassword();
    }
    @When("user click button signup")
    public void userClickButtonSignup() {
        signupPage.clickSignup();
    }
    @Then("alert signup successful is displayed and click ok")
    public void alertSignupSuccessfulIsDisplayedAndClickOk() {
        signupPage.validateSignupSuccessful();
    }

    @And("user input username {string} on register form")
    public void userInputUsernameOnRegisterForm(String username) {
        signupPage.inputExistUsername(username);
    }

    @And("user input password {string} on register form")
    public void userInputPasswordOnRegisterForm(String password) {
        signupPage.inputExistPassword(password);
    }

    @Then("alert this user already exist is displayed and click ok")
    public void alertAccountAlreadyExistIsDisplayedAndClickOk() {
        signupPage.validateIsAccountExist();

    }
}
