package Package_Practice;

import static io.restassured.RestAssured.*; // given (),when(), then
import static  org.hamcrest.Matchers.*; // equalTo(), containsString(), greaterThan()
import io.restassured.response.Response; // Response CLass
import org.testng.annotations.*; // For TestNG


public class Test001 {

    @Test
    public void m1(){
        given().
                when().get("https://gorest.co.in/public/v2/users").
                then().log().all()
                .statusCode(200);
                //.body( "name" ,equalTo("Jagadisha Gill"));


    }

}
