package Package_Practice;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Assignment1 {
    @Test
    public void m1(){
        Response rs  = given()
                       .when().get("https://gorest.co.in/public/v2/users");
        System.out.println(rs.then().log().all());

        List<String> email =  rs.jsonPath().get("email");
        List<String>gender = rs.jsonPath().get("gender");

        Assert.assertTrue(email.contains("rana_ameyatma@boehm.example"));
        Assert.assertEquals(rs.header("Content-Type"),"application/json; charset=utf-8");

        int indexOfemail = email.indexOf("rana_ameyatma@boehm.example");
        Assert.assertEquals(gender.get(indexOfemail),"female");


    }
}
