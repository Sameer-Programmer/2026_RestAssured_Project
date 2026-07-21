package Package_Practice;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Assigment2 {


    @Test
    public void m1(){
        Response rs = given()
                .when().get("https://www.w3schools.com/xml/simple.xml");

        XmlPath xp = new XmlPath(rs.asString());
         List<String> name =xp.getList("breakfast_menu.food.name");
         List<String>price = xp.getList("breakfast_menu.food.price");

         int nameIndex = name.indexOf("Strawberry Belgian Waffles");
         Assert.assertEquals(price.get(nameIndex),"$7.95");

        Assert.assertTrue(name.contains("Strawberry Belgian Waffles"));

    }
}
