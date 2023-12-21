package helper;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.File;

public class utility {
    public static File getJSONSchemaFile (String JSONFile){
        return new File("src/test/java/helper/JSONSchemaData/"+JSONFile);
    }
    public static String generateRandomEmail(){
        String allowedChar = "abcdefghijklmnopqrstuvwxyz" + "0123456789" + "_-.";
        String email = "";
        String temp = RandomStringUtils.randomAlphanumeric(10); //panjang email 10 karakter
        email = temp + "@testdata.com";
        return email;
    }
}
