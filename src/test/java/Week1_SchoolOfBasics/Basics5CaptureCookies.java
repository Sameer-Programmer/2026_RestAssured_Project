package SchoolOfBasics;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class Basics5CaptureCookies {


    @Test
    public void m1() {
        Response rs = given()
                .when().get("https://www.google.com/");

//        String cookie1 = rs.getCookie("AEC");
//        System.out.println(cookie1);
//
       Map<String, String> allCookies = rs.getCookies();
//        System.out.println(allCookies);
//
//        System.out.println(allCookies.keySet());

        for(String k :allCookies.keySet()){
            System.out.println(k+"    "+rs.getCookie(k));
        }


    }

}



