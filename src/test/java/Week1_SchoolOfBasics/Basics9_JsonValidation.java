package Week1_SchoolOfBasics;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
/*
Task - Vlaidate the email in a given json response
 */


public class Basics9_JsonValidation {


    @Test
    public void m1(){
        Response rs = given()
                  .when().get("https://gorest.co.in/public/v2/users");
        System.out.println(rs.then().log().body());

       String ls =  rs.jsonPath().getList("email").toString();
       Assert.assertTrue(ls.contains("adityanandana_ahuja@wilderman-strosin.example"));
    }
}
//

/*
[
    {
        "id": 8551538,
        "name": "Sharda Sharma",
        "email": "sharma_sharda@mcdermott.example",
        "gender": "male",
        "status": "active"
    },
    {
        "id": 8551537,
        "name": "Dakshayani Dutta",
        "email": "kin_adiga@bogisich.example",
        "gender": "male",
        "status": "inactive"
    }
    ]
 */