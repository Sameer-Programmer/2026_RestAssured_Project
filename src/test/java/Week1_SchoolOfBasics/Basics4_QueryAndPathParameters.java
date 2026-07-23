package Week1_SchoolOfBasics;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Basics4_QueryAndPathParameters {

    //https://gorest.co.in/public/v2/users?id=8549923
    String url = "https://gorest.co.in/public/v2/users?";



    @Test
    public void m1(){

        given().pathParam("mypath","users")
                .queryParam("id",8549923).
                when().get("https://gorest.co.in/public/v2/{mypath}")
                .then().log().all()
        .statusCode(200);
    }
}
/*
1) Query Parameters and path Parameters we pass as key Value Pairs
2) Path Parameters - we should add in the When() sections as well for type of request
*/