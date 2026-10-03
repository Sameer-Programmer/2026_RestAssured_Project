package Week1_SchoolOfBasics;

import org.testng.annotations.Test;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import static io.restassured.RestAssured.*;

public class Basics12_JsonResonseSchemaValidation {

    @Test
    public void m1(){
        given()
                .when().get("https://gorest.co.in/public/v2/users")
                .then()
               .body(matchesJsonSchemaInClasspath("jsonSchemaFile.json"));
    }
}

/*
Note
src/test/resources is part of the test classpath,
so matchesJsonSchemaInClasspath() can locate the schema using only its classpath-relative filename.
 */