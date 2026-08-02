package Demo_Prac;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test1 {
    @Test
    public void m1(){
     Response rs =    given().
                when().get("https://gorest.co.in/public/v2/users");

     int code = rs.statusCode();
        System.out.println(rs.asPrettyString());
        Assert.assertEquals(200,code);
        String response = rs.toString();
        Assert.assertTrue(response.contains("Ananta Pilla"));


    }
}
