package Package_Day2;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Test1 {

    @Test(priority = 1)
    public void createUserList() throws FileNotFoundException {
        String url = "https://gorest.co.in/public/v2/users/";
        int id;
        String token = "84ff627b3a5c7fdfb16f12f61b18cd67401de3cc6b7201ab977ba88883fa7675";

        FileInputStream fs = new FileInputStream("./JsonFiles//File1.json");

        Response response = given().header("Authorization", "Bearer " + token)
                .contentType("application/json")
                .body(fs)
                .when().post(url);

        id = response.jsonPath().getInt("id");
        int statusCode = response.statusCode();
        System.out.println(statusCode + "         StatusCode");
        response.then().log().all().statusCode(201);
        response.then().body("name", equalTo("Sp1"));
        response.then().body("email", equalTo("apawan@spgmail.com"));


    }

}
