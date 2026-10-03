package Week4_ChainingConcept;

import Utils.FakerClass;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import com.google.gson.JsonObject;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class getUser {

    @Test
       public void m1(ITestContext context)

    {
        int userid = (Integer) context.getAttribute("user_id");
        String url = "https://gorest.co.in/public/v2/users/{userid}";
        String token ="84ff627b3a5c7fdfb16f12f61b18cd67401de3cc6b7201ab977ba88883fa7675";


        Response rs =given()
                .header("Authorization","Bearer "+token)
                .pathParam("userid",userid)
                .when()
                .get(url);
       int responseCode = rs.statusCode();

       Assert.assertEquals(200,responseCode);
        System.out.println(rs.asPrettyString());
        System.out.println("class getUser User Execueed successfully ");

       }
}
