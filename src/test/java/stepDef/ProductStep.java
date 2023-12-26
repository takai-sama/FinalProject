package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPage;

public class ProductStep {
    ProductPage productPage;
    public ProductStep(){
        this.productPage = new ProductPage();
    }

    @When("user click on category")
    public void userClickOnCategory() {
        productPage.categoryClick();
        productPage.productFirstPage();
    }

    @And("click next for the rest result")
    public void clickNextForTheRestResult() {
        productPage.productSecondPage();
    }

    @Then("all product is displayed")
    public void allProductIsDisplayed() {
        productPage.allProductDisplayed();
    }

    @When("user click on phones category")
    public void userClickOnPhonesCategory() {
        productPage.phoneCatClick();
    }

    @Then("only phones product is displayed")
    public void onlyPhonesProductIsDisplayed() {
        productPage.phoneDisplayed();
    }

    @When("user click on laptop category")
    public void userClickOnLaptopCategory() {
        productPage.laptopCatClick();
    }

    @When("user click on monitor category")
    public void userClickOnMonitorCategory() {
        productPage.monitorCatClick();
    }

    @Then("only monitor product is displayed")
    public void onlyMonitorProductIsDisplayed() {
        productPage.monitorDisplayed();
    }

    @Then("only laptop product is displayed")
    public void onlyLaptopProductIsDisplayed() {
        productPage.laptopDisplayed();
    }
}

