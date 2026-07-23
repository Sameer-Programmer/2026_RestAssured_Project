package Week3AuthenticationTopics;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test3OAuth {
    @Test
    public void  m1(){
        given()
                .auth().oauth("consumerkey","consumerSecrat","accessToken","tokenSecrate")
                .when().get("{{gorest}}/public/v2/users")
                .then().statusCode(200);
    }
    public void  m2(){
        given()
                .auth().oauth2("abh678")
                .when().get("{{gorest}}/public/v2/users")
                .then().statusCode(200);
    }
}
