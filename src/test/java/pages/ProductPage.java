package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static helper.utility.*;
import static org.assertj.core.api.Assertions.assertThat;



public class ProductPage {
    By category = By.id("cat");
    By phoneCat = By.xpath("//*[@class=\"list-group-item\"][2]");
    By laptopCat = By.xpath("//*[@class=\"list-group-item\"][3]");
    By monitorCat = By.xpath("//*[@class=\"list-group-item\"][4]");
    By productName = By.cssSelector("h4.card-title");
    By nextButton = By.xpath("//*[@id=\"next2\"]");



    List<String> element_string = new ArrayList<>();
    

    public void productFirstPage(){
        List<WebElement> elements = driver.findElements(productName);
        for(WebElement element : elements) {
            element_string.add(element.getText());
        }
    }

    public void productSecondPage(){
        driver.findElement(nextButton).click();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
        w.until(ExpectedConditions.invisibilityOfElementLocated(nextButton));
        List<WebElement> elements = driver.findElements(productName);
        for(WebElement element : elements) {
            element_string.add(element.getText());
        }
    }
    public void allProductDisplayed(){
        System.out.println(element_string);
        assertThat(element_string.containsAll(allProducts));
        element_string.clear();
    }
    public void categoryClick(){
        driver.findElement(category).click();
    }

    public void phoneCatClick(){
        driver.findElement(phoneCat).click();

    }

    public void phoneDisplayed() {
        WebElement pageElement = driver.findElement(productName);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
        w.until(ExpectedConditions.stalenessOf(pageElement));
        List<WebElement> elements = driver.findElements(productName);
            for (WebElement element : elements) {
                element_string.add(element.getText());
            }
            System.out.println(element_string);
        assertThat(element_string).containsAll(phoneProducts);
        element_string.clear();
    }
    public void monitorCatClick(){
        driver.findElement(monitorCat).click();
    }

    public void monitorDisplayed() {
        WebElement pageElement = driver.findElement(productName);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
        w.until(ExpectedConditions.stalenessOf(pageElement));
        List<WebElement> elements = driver.findElements(productName);
        for (WebElement element : elements) {
            element_string.add(element.getText());
        }
        System.out.println(element_string);
        assertThat(element_string).containsAll(monitorProducts);
        element_string.clear();
    }

    public void laptopCatClick(){
        driver.findElement(laptopCat).click();
    }

    public void laptopDisplayed() {
        WebElement pageElement = driver.findElement(productName);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
        w.until(ExpectedConditions.stalenessOf(pageElement));
        List<WebElement> elements = driver.findElements(productName);
        for (WebElement element : elements) {
            element_string.add(element.getText());
        }
        System.out.println(element_string);
        assertThat(element_string).containsAll(laptopProducts);
        element_string.clear();
    }


}
