package Utils;

import com.github.javafaker.Faker;

public class DataGenerator {
    static Faker faker = new Faker();

    public static String getName(){
        return  faker.name().firstName();
    }
    public static String getEmail(){
        return  faker.internet().emailAddress();
    }

   public static String getGender(){
        return "Male";
   }
    public static String getStatusActive(){
        return "active";
    }



}
