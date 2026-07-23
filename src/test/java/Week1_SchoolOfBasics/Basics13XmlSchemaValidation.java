package Week1_SchoolOfBasics;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class Basics13XmlSchemaValidation   {

    @Test
    public void  m1 (){
        given()
                .when().get("https://www.w3schools.com/xml/simple.xml")
                .then().body(matchesXsdInClasspath("breakfast.xsd"));
    }
}
