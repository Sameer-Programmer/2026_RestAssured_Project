package Package_Practice;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Assignment1_Practice {

    @Test
    public void m1(){
       Response rs =  given()
                .when().get("https://gorest.co.in/public/v2/users");

        System.out.println(rs.then().log().body());

     List<String> email  = rs.jsonPath().getList("email");
     List<String> gender = rs.jsonPath().getList("gender");

        Assert.assertEquals(rs.getStatusCode(),200);
        Assert.assertEquals(rs.header("Content-Type"),"application/json; charset=utf-8");
        Assert.assertTrue(email.contains("rana_ameyatma@boehm.example"));

        int emailIndex = email.indexOf("rana_ameyatma@boehm.example");
        Assert.assertEquals(gender.get(emailIndex),"female");
    }


}
