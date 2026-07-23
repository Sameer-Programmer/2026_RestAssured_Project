package Week1_SchoolOfBasics;


import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

/*
given().
when().get() or post().put().del()
then()

// Below is get Request
 */


public class Basics1 {

    @Test
    public void Test1(){
        Response rs =  given().
                when().get("https://gorest.co.in/public/v2/users");

        int statuscode = rs.statusCode();
        Assert.assertEquals(statuscode,200);

    }

    @Test
    public void Test2(){
        given().
                when().get("https://gorest.co.in/public/v2/users")
                .then().statusCode(200).log().all();
    }

}
