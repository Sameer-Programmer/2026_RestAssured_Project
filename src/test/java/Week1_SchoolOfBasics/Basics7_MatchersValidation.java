package Week1_SchoolOfBasics;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Basics7_MatchersValidation {


    @Test
    public void m1() {
        given()
                .when()
                .get("https://gorest.co.in/public/v2/users")
                .then().log().all().
                statusCode(200)
                .header("Content-Type", "application/json; charset=utf-8")
                .body("[1].email", equalTo("deenabandhu_bharadwaj@toy.example"));
    }
}
