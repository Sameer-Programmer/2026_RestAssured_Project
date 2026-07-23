package SchoolOfBasics;

import org.testng.annotations.Test;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Basics12_JsonResonseSchemaValidation {

    @Test
    public void m1(){
        given()
                .when().get("https://gorest.co.in/public/v2/users")
                .then()
               .body(matchesJsonSchemaInClasspath("jsonSchemaFile.json"));
    }
}
