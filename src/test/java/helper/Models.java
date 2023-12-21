package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.utility.generateRandomEmail;

public class Models {
    private static RequestSpecification request;
    public static void setupHeader(){
        request = RestAssured.given()
                .header("Content-Type","application/json")
                .header("Accept","application/json")
                .header("app-id","65771b4863ccc0750ad43ff2");
    }
    public static Response getListUsers(String endpoint){
        setupHeader();
        return request.when().get(endpoint);
    }
    public static Response postCreateNewUser(String endpoint){
        String firstName ="Panji";
        String lastName ="Maulana";
        String title = "mr";
        String email = generateRandomEmail();
        JSONObject payload = new JSONObject();
        payload.put("firstName",firstName);
        payload.put("lastName",lastName);
        payload.put("email", email);
        payload.put("title",title);
        setupHeader();
        return request.body(payload.toString()).when().post(endpoint);
    }
    public static Response deleteUser(String endpoint, String user_id){
        setupHeader();
        String finalEndpoint = endpoint +"/"+user_id;
        System.out.println(finalEndpoint);
        return request.when().delete(finalEndpoint);
    }

    public static Response updateUser(String endpoint, String user_id){
        setupHeader();
        String firstName ="Panji edit";
        String lastName ="Maulana edit";
        JSONObject payload = new JSONObject();
        payload.put("firstName",firstName);
        payload.put("lastName",lastName);
        String finalEndpoint = endpoint +"/"+user_id;
        System.out.println(finalEndpoint);
        return request.body(payload.toString()).when().put(finalEndpoint);
    }
}
