package PraticeZone;



import static io.restassured.RestAssured.*;

public class Test1 {

    public void m1(){
        //given().auth().basic()
        //given().auth().digest()
       // given().auth().preemptive().basic()
        // Bearer Token
//        String token = "123";
//        given().header("Authorization","Bearer "+token)
//                .when().get().then();

//        given().auth().oauth2("")
//                .when().get().then();

        //Api Key

        given().pathParam("key","vale")
                .queryParam("id","value")
                .when()
                .get().
                then().statusCode(200);



    }
}
