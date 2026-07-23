package Week1_SchoolOfBasics;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Basics8_TestNgValidations {
    String url = "https://gorest.co.in/public/v2/users";

    @Test
    public void m1() {
        Response rs = given()
                .when().get(url);
        System.out.println(rs.then().log().all());
        Assert.assertEquals(rs.getStatusCode(), 200); //TestNg Assertions
        Assert.assertEquals(rs.header("Content-Type"), "application/json; charset=utf-8");
        String bookName = rs.jsonPath().get("[1].name").toString();
        Assert.assertEquals(bookName, "Deenabandhu Bharadwaj");


    }
}
