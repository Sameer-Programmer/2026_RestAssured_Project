package Week1_SchoolOfBasics;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Basics2 {

    /*
This prints the complete response, including:
Status code
Headers
Response body
Easy way to remember:

given().log().all() → Logs Request details
then().log().all() → Logs Response details
*/



    @Test
    public void m1(){
        given().log().all()
                .get("https://gorest.co.in/public/v2/users")
                .then().log().all().statusCode(200);
    }
}
