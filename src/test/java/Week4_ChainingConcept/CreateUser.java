package Week4_ChainingConcept;

import Utils.FakerClass;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import com.google.gson.JsonObject;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class CreateUser {

    String url = "https://gorest.co.in/public/v2/users";
    String token = "84ff627b3a5c7fdfb16f12f61b18cd67401de3cc6b7201ab977ba88883fa7675";

    @Test
    public void m1(ITestContext context) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", FakerClass.getName());
        jsonObject.addProperty("gender", FakerClass.getGender());
        jsonObject.addProperty("email", FakerClass.getEmail());
        jsonObject.addProperty("status", FakerClass.getStatusActive());

        Response response = given().header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(jsonObject.toString())
                .when().post(url);
        int responseCode = response.getStatusCode();
        Assert.assertEquals(201, responseCode);
        int userid = response.jsonPath().getInt("id");
        System.out.println(userid);
        System.out.println(response.asPrettyString());
        context.setAttribute("user_id", userid);

        System.out.println("class Created User Execueed successfully ");

    }


}
