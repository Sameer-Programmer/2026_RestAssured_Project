package Package_Day2;

import Utils.DataGenerator;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Test2 {

    @Test(priority = 1)
    public void createUserList() throws IOException {
        String url = "https://gorest.co.in/public/v2/users/";
        int id;
        String token = "84ff627b3a5c7fdfb16f12f61b18cd67401de3cc6b7201ab977ba88883fa7675";
        String json = Files.readString(Paths.get("./JsonFiles//File2.json"));
        json = json.replace("${name}", DataGenerator.getName());
        json = json.replace("${email}", DataGenerator.getEmail());

        Response response = given().header("Authorization", "Bearer " + token)
                .contentType("application/json")
                .body(json)
                .when().post(url);

        id = response.jsonPath().getInt("id");
        int statusCode = response.statusCode();
        System.out.println(statusCode + "         StatusCode");
        response.then().log().all().statusCode(201);


    }
}
