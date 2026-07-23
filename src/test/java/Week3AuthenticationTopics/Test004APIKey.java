package Week3AuthenticationTopics;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test004APIKey {


    @Test
    public void m1(){
        given().queryParam("appid","fe9c5cddb7e01d747b4611c3fc9eaf2c")// Here Appid is the key appid Key - Value is api key
                .when().get("url")
                .then().statusCode(200).log().all();
    }
}
