package pages;

import helper.Endpoint;
import helper.utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.File;
import java.util.List;

import static helper.Models.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiPage {
    String setURL, global_id;
    Response res;
    public void prepareURL(String url){
        switch (url){
            case "HOST_DUMMYAPI_USER":
                setURL= Endpoint.HOST_DUMMYAPI_USER;
                break;
            case "CREATE_NEW_USERS":
                setURL= Endpoint.CREATE_NEW_USERS;
                break;
            case "HOST_DUMMYAPI_TAG":
                setURL= Endpoint.HOST_DUMMYAPI_TAG;
                break;
            default:
                System.out.println("No option");
        }
        System.out.println("Endpoint : "+setURL);
    }

    public void hitApiGetListUsers() {
        res= getListUsers(setURL);
        System.out.println(res.getBody().asString());
    }

    public void hitApiPostCreateNewUser(){
        res= postCreateNewUser(setURL);
        System.out.println(res.getBody().asString());
    }
    public void validationStatusCodeIsEquals(int status_code) {
        assertThat(res.statusCode()).isEqualTo(status_code);
    }
    public void validationResponseBodyGetListUsers() {
        List<Object> id = res.jsonPath().getList("data.id");
        List<Object> title = res.jsonPath().getList("data.title");
        List<Object> firstName = res.jsonPath().getList("data.firstName");
        List<Object> lastName = res.jsonPath().getList("data.lastName");
        List<Object> picture = res.jsonPath().getList("data.picture");
        assertThat(id.get(0)).isNotNull();
        assertThat(title.get(0)).isIn("mr","ms","mrs","miss");
        assertThat(firstName.get(0)).isNotNull();
        assertThat(lastName.get(0)).isNotNull();
        assertThat(picture.get(0)).isNotNull();
    }
    public void validationResponseBodyPostCreateNewUser() {
        JsonPath jsonPathEvaluator = res.jsonPath();
        String id = jsonPathEvaluator.get("id");
        String title = jsonPathEvaluator.get("title");
        String firstName = jsonPathEvaluator.get("firstName");
        String lastName = jsonPathEvaluator.get("lastName");
        String email = jsonPathEvaluator.get("email");
        String registerDate = jsonPathEvaluator.get("registerDate");
        String updatedDate = jsonPathEvaluator.get("updatedDate");
        assertThat(id).isNotNull();
        assertThat(title).isIn("mr","ms","mrs","miss");
        assertThat(firstName).isNotNull();
        assertThat(lastName).isNotNull();
        assertThat(email).isNotNull();
        assertThat(registerDate).isNotNull();
        assertThat(updatedDate).isNotNull();
        global_id = id;
    }

    public void validationResponseJsonWithJSONSchema(String filename) {
        File JSONFile = utility.getJSONSchemaFile(filename);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));
    }

    public void hitApiDeleteUser(){
        res=deleteUser(setURL,global_id);
        System.out.println("Id deleted : " + res.getBody().asString());
    }
    public void hitApiUpdateData(){
        res=updateUser(setURL,global_id);
        System.out.println(res.getBody().asString());
    }
    public void validationResponseBodyPostUpdateData() {
        JsonPath jsonPathEvaluator = res.jsonPath();
        String id = jsonPathEvaluator.get("id");
        String title = jsonPathEvaluator.get("title");
        String firstName = jsonPathEvaluator.get("firstName");
        String lastName = jsonPathEvaluator.get("lastName");
        String email = jsonPathEvaluator.get("email");
        String registerDate = jsonPathEvaluator.get("registerDate");
        String updatedDate = jsonPathEvaluator.get("updatedDate");
        assertThat(id).isNotNull();
        assertThat(title).isIn("mr", "ms", "mrs", "miss");
        assertThat(firstName).isNotNull();
        assertThat(lastName).isNotNull();
        assertThat(email).isNotNull();
        assertThat(registerDate).isNotNull();
        assertThat(updatedDate).isNotNull();
    }

    public void hitApiGetListTag() {
        res= getListUsers(setURL);
    }
    public void validationResponseBodyGetListTag() {
        List<Object> tags = res.jsonPath().getList("data");
        assertThat(tags.get(0)).isNull();
        for (int i = 1; i <= 20; i++) {
            assertThat(tags.get(i)).isNotNull();
            System.out.println(tags.get(i));
        }


    }




}
