package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;

public class CartStep {
    CartPage cartPage;
    public CartStep(){
        this.cartPage = new CartPage();
    }
    @When("user click cart button")
    public void userClickCartButton() {
        cartPage.goToCart();
    }

    @Then("user navigate to cart page")
    public void userNavigateToCartPage() {
        cartPage.verifyCartPage();
    }

    @And("user delete it from cart")
    public void userDeleteItFromCart() throws InterruptedException{
        cartPage.deleteProduct();
        cartPage.verifyDeleteProduct();
    }

    @When("user click on place order button")
    public void userClickOnPlaceOrderButton() {
        cartPage.placeOrderClick();
    }

    @And("user fill all order information")
    public void userFillAllOrderInformation() {
        cartPage.fillInformation();
    }

    @And("user click on purchase button")
    public void userClickOnPurchaseButton() throws InterruptedException{
        cartPage.purchaseClick();
    }

    @Then("order invoice is displayed and user click ok")
    public void orderInvoiceIsDisplayedAndUserClickOk() {
        cartPage.verifyInvoice();
    }
}
