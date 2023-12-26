package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class utility {
    public static WebDriver driver;
    public static final String randomInput = generateUsernamePassword();
    public static final List<String> allProducts = Collections.unmodifiableList(
            Arrays.asList("Samsung galaxy s6","Nokia lumia 1520","Nexus 6","Samsung galaxy s7","Iphone 6 32gb",
                    "Sony xperia z5","HTC One M9","Sony vaio i5","Sony vaio i7", "Apple monitor 24",
                    "MacBook air", "Dell i7 8gb"," 2017 Dell 15.6 Inch", "ASUS Full HD", "MacBook Pro"));
    public static final List<String> phoneProducts = Collections.unmodifiableList(
            Arrays.asList("Samsung galaxy s6","Nokia lumia 1520","Nexus 6","Samsung galaxy s7","Iphone 6 32gb",
                    "Sony xperia z5","HTC One M9"));
    public static final List<String> monitorProducts = Collections.unmodifiableList(
            Arrays.asList("Apple monitor 24","ASUS Full HD"));

    public static final List<String> laptopProducts = Collections.unmodifiableList(
            Arrays.asList("Sony vaio i5","Sony vaio i7", "MacBook air",
                    "Dell i7 8gb","2017 Dell 15.6 Inch", "MacBook Pro"));


    public static File getJSONSchemaFile (String JSONFile){
        return new File("src/test/java/helper/JSONSchemaData/"+JSONFile);
    }
    public static String generateRandomEmail(){
        String temp = RandomStringUtils.randomAlphanumeric(10); //panjang email 10 karakter
        String email = temp + "@testdata.com";
        return email;
    }
    public static String generateUsernamePassword(){
        String temp = RandomStringUtils.randomNumeric(10);
        String input= "user_"+temp;
        return input;
    }



    public static void startDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}

