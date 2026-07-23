package Week1_SchoolOfBasics;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Basics10_XmlValidation {


    @Test
    public void m1(){
       Response rs =  given()
                .when().get("https://www.w3schools.com/xml/simple.xml");
        System.out.println(rs.then().log().all());

        Assert.assertEquals(rs.getStatusCode(),200);
        Assert.assertEquals(rs.header("Content-Type"),"text/xml");
        XmlPath xp = new XmlPath(rs.asString());

       // Lt<String> names is= xp.getList("breakfast_menu.food.name");
        String names = xp.getList("breakfast_menu.food.name").toString();
        List<String> price = xp.getList("breakfast_menu.food.price");

        Assert.assertTrue(names.contains("Belgian Waffles"));
        int index = names.indexOf("Belgian Waffles");
        Assert.assertEquals(price.get(index),"$7.95");

    }
}
