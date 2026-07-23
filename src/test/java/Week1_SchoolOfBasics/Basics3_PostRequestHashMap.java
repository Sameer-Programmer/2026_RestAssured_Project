package SchoolOfBasics;

import Utils.DG1;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Basics3_PostRequestHashMap {

    String personFirstname;
    String personEmail;
    String token ="84ff627b3a5c7fdfb16f12f61b18cd67401de3cc6b7201ab977ba88883fa7675";
    String url = " https://gorest.co.in/public/v2/users";


   @Test
    public void m1(){
       personFirstname = DG1.getFirstName();
       personEmail = DG1.getEmail();
       HashMap hm = new HashMap();
       hm.put("name",DG1.getFirstName());
       hm.put("gender","male");
       hm.put("status","active");
       hm.put("email",DG1.getEmail());
        given().
                header("Authorization","Bearer "+token)
                .contentType("application/json")
                .body(hm)
                .when().post(url)
                .then().statusCode(201);
    }
}
