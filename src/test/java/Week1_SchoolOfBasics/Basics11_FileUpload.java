package Week1_SchoolOfBasics;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

import static io.restassured.RestAssured.given;

public class Basics11_FileUpload {

    @Test
    public void m1(){
        File myfile = new File("C:\\Users\\Mohamed Imran\\OneDrive\\Desktop\\Naukri\\Demo.txt");
       Response rs =  given()
                .multiPart("file",myfile)
                .when().post("https://httpbin.org/post");
        Assert.assertEquals( rs.getStatusCode(),"200");
        List<String> ls = rs.jsonPath().getList("filename");
        Assert.assertTrue(ls.contains("Demo.txt"));
    }


    @Test
    public void m2(){
        File myfile1 = new File("C:\\Users\\Mohamed Imran\\OneDrive\\Desktop\\Naukri\\Demo1.txt");
        File myfile2= new File("C:\\Users\\Mohamed Imran\\OneDrive\\Desktop\\Naukri\\Demo2.txt");
        Response rs =
                given()
                .multiPart("file",myfile1)
                .multiPart("file",myfile2)
                .when().post("https://httpbin.org/post");
        Assert.assertEquals( rs.getStatusCode(),200);
        List<String> ls = rs.jsonPath().getList("filename");
        Assert.assertTrue(ls.contains("Demo.txt"));

    }
}
