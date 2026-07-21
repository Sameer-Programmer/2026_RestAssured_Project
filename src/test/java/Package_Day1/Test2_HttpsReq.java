package Package_Day1;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

public class Test2_HttpsReq {
    String token = "84ff627b3a5c7fdfb16f12f61b18cd67401de3cc6b7201ab977ba88883fa7675";
    int id;

    @Test
    public void getuserList() {
//String token = "84ff627b3a5c7fdfb16f12f61b18cd67401de3cc6b7201ab977ba88883fa7675";

        given()
                .header("Authorization", "Bearer " + token)
                .when()
                .get("https://gorest.co.in/public/v2/users")
                .then()
                .statusCode(200)
                .body("[1].id", equalTo(8516692))
                .body("[1].email", equalTo("user272@example.com"))
                .log().all();
    }

    @Test
    public void CreateUser() {

        HashMap hm = new HashMap();
        hm.put("name", "Shaik1112P1awan111");
        hm.put("email", "shaik11111Pawan2@yopmail.com");
        hm.put("gender", "male");
        hm.put("status", "active");

        Response rs = given().header("Authorization", "Bearer " + token)
                .contentType("application/json")
                .body(hm)
                .when()
                .post("https://gorest.co.in/public/v2/users");
        id = rs.jsonPath().getInt("id");
                rs.then()
                .log().all()
                .statusCode(201);

    }
}
