package Package_Day1;

import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Test4 {
    String url = "https://gorest.co.in/public/v2/users/";
    static int id;
    static String token =
            "84ff627b3a5c7fdfb16f12f61b18cd67401de3cc6b7201ab977ba88883fa7675";
    Faker faker = new Faker();
    static String personName;
    static String personEmail;
    static String updatedName;
    static String updatedEmail;

    @Test(priority = 1)
    public void createUserList() {
        HashMap map = new HashMap();
        personName = faker.name().firstName();
        personEmail = faker.internet().emailAddress();
        System.out.println(personName + "          PersonName");
        System.out.println(personEmail + "                 PersonEmail");
        map.put("name", personName);
        map.put("email", personEmail);
        map.put("gender", "male");
        map.put("status", "active");


        Response response = given().header("Authorization", "Bearer " + token)
                .contentType("application/json")
                .body(map)
                .when().post(url);

        id = response.jsonPath().getInt("id");
        int statusCode = response.statusCode();
        System.out.println(statusCode + "         StatusCode");
        response.then().log().all().statusCode(201);
        response.then().body("name", equalTo(personName));
        response.then().body("email", equalTo(personEmail));


    }

    @Test(enabled = true, priority = 2)
    public void getuser() {
        System.out.println(id + "        id");
        System.out.println("GET URL = " + url + id);
        Response response = given().header("Authorization", "Bearer " + token).
                when().get(url + id);
        response.then().log().all();
        response.then().statusCode(200);
        response.then().body("name", equalTo(personName))
                .body("id", equalTo(id))
                .body("email", equalTo(personEmail));
    }

    @Test(priority = 3)
    public void updateuser() {
        updatedName = faker.name().firstName();
        updatedEmail = faker.internet().emailAddress();

        HashMap hashMap = new HashMap();
        hashMap.put("name", updatedName);
        hashMap.put("email", updatedEmail);
        hashMap.put("gender", "male");
        hashMap.put("status", "active");

        Response response = given().header("Authorization", "Bearer " + token)
                .contentType("application/json").body(hashMap)
                .when().put(url + id);

        response.then().log().all();
        response.then().statusCode(200);
        response.then().body("id", equalTo(id));


    }

    @Test( priority = 4)
    public void DelUser() {
        System.out.println(id + "        id");
        System.out.println("GET URL = " + url + id);
        Response response = given().header("Authorization", "Bearer " + token).
                when().delete(url + id);
        response.then().log().all();
        response.then().statusCode(204);
    }


}
