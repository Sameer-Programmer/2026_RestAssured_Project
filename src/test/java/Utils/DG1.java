package Utils;

import com.github.javafaker.Faker;

public class DG1 {

    static Faker faker =new Faker();

    public static String getFirstName(){
       return faker.name().firstName();
    }

    public static  String getEmail(){
        return faker.internet().emailAddress();
    }
}
