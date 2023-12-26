package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DescriptionPage;

public class DescriptionStep {
    DescriptionPage descriptionPage;
    public DescriptionStep(){
        this.descriptionPage= new DescriptionPage();
    }
    @When("user click product Samsung galaxy s6")
    public void userClickProduct() {
        descriptionPage.samsungS6Click();
    }

    @Then("user redirect to corresponding product page")
    public void userRedirectToCorrespondingProductPage() {
        descriptionPage.verifyCorrespondingPage();
    }

    @Then("Verify that the description of a product is the same on the homepage as on the product page")
    public void verifyThatTheDescriptionOfAProductIsTheSameOnTheHomepageAsOnTheProductPage() {
        descriptionPage.verifyTitleDesc();
    }

    @Then("Verify that the price of a product is the same on the homepage as on the product page")
    public void verifyThatThePriceOfAProductIsTheSameOnTheHomepageAsOnTheProductPage() {
        descriptionPage.verifyPrice();
    }

    @When("user add selected product to cart")
    public void userAddSelectedProductToCart() {
        descriptionPage.addToCart();
    }

    @Then("alert of item added is displayed and user accept that")
    public void alertOfItemAddedIsDisplayedAndUserAcceptThat() {
        descriptionPage.verifyProductAddToCart();
    }
}
