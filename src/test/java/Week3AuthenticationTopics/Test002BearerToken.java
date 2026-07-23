package Week3AuthenticationTopics;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestBearerToken {


    @Test
    public void m1(){
        HashMap hm = new HashMap();
        hm.put("name","S11ameerBhai456aa");
        hm.put("gender","male");
        hm.put("email","p1awan@gmail2a.com");
        hm.put("status","active");
       // String token ="84ff627b3a5c7fdfb16f12f61b18cd67401de3cc6b7201ab977ba88883fa7675";
        String token = "84ff627b3a5c7fdfb16f12f61b18cd67401de3cc6b7201ab977ba88883fa7675";
        given()
                .header("Authorization","Bearer "+token)
                .contentType("application/json")
                .body(hm)
                .when()
                .post("https://gorest.co.in//public/v2/users")
                .then()
                  .statusCode(201)
                   .body("name",equalTo("S11ameerBhai456aa"))
                   .log().all();





    }
}
