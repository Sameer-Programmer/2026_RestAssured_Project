package SchoolOfBasics;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Basics6Headers {


    @Test
    public void m1(){
       Response rs =  given()
                             .when()
                                 .get("https://www.google.com/");
        rs.then().header("Content-Type","text/html; charset=ISO-8859-1");
        System.out.println(rs.getHeaders());

    }
}
