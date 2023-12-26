package pages;

import org.assertj.core.api.AssertionsForClassTypes;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.utility.driver;
import static org.assertj.core.api.Assertions.assertThat;

public class DescriptionPage {
        By samsungS6 = By.xpath("//*[@class=\"hrefch\"][1]");
        By samsungS6Desc = By.xpath("//*[@id=\"article\"][1]");
        By samsungS6Price = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h5");
        By addToCartButton = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");

        String titleSamsung,hrefSamsung,descSamsung,priceSamsung;

        public void samsungS6Click(){
            titleSamsung = driver.findElement(samsungS6).getText();
            hrefSamsung = driver.findElement(samsungS6).getAttribute("href");
            descSamsung = driver.findElement(samsungS6Desc).getText();
            priceSamsung = driver.findElement(samsungS6Price).getText();
            driver.findElement(samsungS6).click();
        }

        public void verifyCorrespondingPage(){
            assertThat(hrefSamsung).isEqualTo(driver.getCurrentUrl());
        }
        public void verifyTitleDesc(){

            assertThat(titleSamsung).isEqualTo(driver.findElement(By.className("name")).getText());
            assertThat(descSamsung).isEqualTo(driver.findElement(By.xpath("//*[@id=\"more-information\"]/p")).getText());
        }
        public void verifyPrice(){
            String temp = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/h3")).getText();
            String deleteTax = temp.replace(" *includes tax", "");
            assertThat(priceSamsung).isEqualTo(deleteTax);
        }

        public void addToCart(){
            driver.findElement(addToCartButton).click();
        }
        public void verifyProductAddToCart(){
            WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
            w.until(ExpectedConditions.alertIsPresent());
            String alertMessage = driver.switchTo().alert().getText();
            System.out.println(alertMessage);
            AssertionsForClassTypes.assertThat(alertMessage).contains("Product added");
            driver.switchTo().alert().accept();
        }

}
