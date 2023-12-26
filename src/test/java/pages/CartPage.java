package pages;

import org.openqa.selenium.By;

import static helper.utility.driver;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;


public class CartPage {
    By cartButton = By.linkText("Cart");
    By deleteButton = By.linkText("Delete");
    By itemCart = By.cssSelector("tr.success");
    By placeOrderButton = By.cssSelector(("Button.btn.btn-success"));
    By nameTxt = By.id("name");
    By countryTxt = By.id("country");
    By cityTxt = By.id("city");
    By cardTxt = By.id("card");
    By monthTxt = By.id("month");
    By yearTxt = By.id("year");
    By purchaseBtn = By.xpath("//*[@onclick = 'purchaseOrder()']");
    By thanksMsg = By.xpath("/html/body/div[10]/h2");
    By okBtn = By.xpath("//*[text() = 'OK']");

    public void goToCart(){
        driver.findElement(cartButton).click();
    }
    public void verifyCartPage(){
        String current = driver.getCurrentUrl();
        assertThat(current).isEqualTo("https://www.demoblaze.com/cart.html");
    }

    public void deleteProduct()throws InterruptedException{
        driver.findElement(deleteButton).click();
        Thread.sleep(5000);
    }
    public void verifyDeleteProduct(){
        Boolean display = driver.findElements(itemCart).isEmpty();
        assertEquals(true, display);
    }
    public void placeOrderClick(){
        driver.findElement(placeOrderButton).click();
    }
    public void fillInformation(){
        driver.findElement(nameTxt).sendKeys("Panji Maulana Putra");
        driver.findElement(countryTxt).sendKeys("Indonesia");
        driver.findElement(cityTxt).sendKeys("Jakarta");
        driver.findElement(cardTxt).sendKeys("3215678800");
        driver.findElement(monthTxt).sendKeys("12");
        driver.findElement(yearTxt).sendKeys("2023");

    }
    public void purchaseClick()throws InterruptedException{
        driver.findElement(purchaseBtn).click();
        Thread.sleep(5000);
    }
    public void verifyInvoice(){
        Boolean Thanks = driver.findElement(thanksMsg).isDisplayed();
        assertEquals(true,Thanks);
        driver.findElement(okBtn).click();
    }


}
