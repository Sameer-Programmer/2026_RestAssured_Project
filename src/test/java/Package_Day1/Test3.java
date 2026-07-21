package Package_Day1;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

public class Test3 {

        String url = "https://gorest.co.in/public/v2/users";
        int id;
        String token = "84ff627b3a5c7fdfb16f12f61b18cd67401de3cc6b7201ab977ba88883fa7675";

        @Test
        public void createUser(){
            HashMap hm = new HashMap();
            hm.put("name","1Shaik1112P1awan111");
            hm.put("email","1shaik11111Pawan2@yopmail.com");
            hm.put("gender","male");
            hm.put("status","active");

           Response response = given().header("Authorization","Bearer "+token)
                    .contentType("application/json").body(hm)
                    .when().post(url);
                    id = response.jsonPath().getInt("id");
                    response.then().log().all().statusCode(201);
        }


}
