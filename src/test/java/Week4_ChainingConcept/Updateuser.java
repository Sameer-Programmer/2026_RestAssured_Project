package Week4_ChainingConcept;

import Utils.FakerClass;
import com.google.gson.JsonObject;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Updateuser {


        @Test
        public void m1(ITestContext context)

        {
           // int userid =8565397;
           int userid = (Integer) context.getAttribute("user_id");
            String url = "https://gorest.co.in/public/v2/users/{userid}";
            String token = "84ff627b3a5c7fdfb16f12f61b18cd67401de3cc6b7201ab977ba88883fa7675";

            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("name", FakerClass.getName());
            jsonObject.addProperty("gender", FakerClass.getGender());
            jsonObject.addProperty("email", FakerClass.getEmail());
            jsonObject.addProperty("status", FakerClass.getStatusActive());

            Response response = given().header("Content-Type", "application/json")
                    .header("Authorization", "Bearer " + token)
                    .pathParam("userid",userid)
                    .body(jsonObject.toString())
                    .when().put(url);
            int responseCode = response.getStatusCode();
            Assert.assertEquals(200, responseCode);
            System.out.println(response.asPrettyString());

            System.out.println("class updated User Execueed successfully ");
        }


    }
