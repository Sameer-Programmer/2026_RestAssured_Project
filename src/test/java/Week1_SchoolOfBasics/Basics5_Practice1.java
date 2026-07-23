package Week1_SchoolOfBasics;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class Basics5_Practice1 {


    @Test
    public  void m1 (){
       Response rs =  given().when().get("https://www.google.com/");
      //  System.out.println(rs.getCookies());
       Map<String, String > allcookies =  rs.getCookies();
       for(String k : allcookies.keySet()){
           System.out.println(k+"   "+rs.getCookie(k));
       }
    }
}
