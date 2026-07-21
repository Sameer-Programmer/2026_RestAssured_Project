package Package_Day1;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Test1HttpRequests {
    String Url = "https://serve.faux-api.com/1167168a1782d0a2063461cd/userlist/019ef26e-fe3f-7430-b426-138841c5b541";

    @Test

    public void getuserList(){
        given()
                .when().get(Url)
                .then()
                .statusCode(200)
                .body("status",equalTo("success"))
                .body("code",equalTo(200))
                .body("result[0].fullName",equalTo("Cornelius Greenholt"))
                .log().all();
    }


    @Test
    public void createUser(){
        given()
                .when()
                .then()
                .log().all();
    }

}
