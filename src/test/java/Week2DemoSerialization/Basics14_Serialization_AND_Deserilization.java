package Week2DemoSerialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

public class Basics14_Serialization_AND_Deserilization {


    @Test
    public void  m1() throws JsonProcessingException {
        // Object Creation of Class DemoPojoPostRequest
        DemoPojoPostRequest data = new DemoPojoPostRequest(); // pojo Class Obj
        data.setName("Scott901qq");
        data.setEmail("Test1q23q1@yopmail.com");
        data.setGender("male");
        data.setStatus("Active");

        // convert Java Object to JsonObject => Serialization

        // Serialization
        // Convert Java Object → JSON

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(data);
        System.out.println(jsonData);
        //===========================================================================Above part is serilization==


        DemoPojoPostRequest javaObject =
                objectMapper.readValue(jsonData, DemoPojoPostRequest.class);
        //➡️ Deserialization
        System.out.println("Name: " + javaObject.getName());
        System.out.println("Email: " + javaObject.getEmail());
        System.out.println("Status: " + javaObject.getStatus());
        System.out.println("Gender: " + javaObject.getGender());

    }
}

/*
So in your exact code:
objectMapper.writeValueAsString(data);

➡️ Serialization
objectMapper.readValue(jsonData, DemoPojoPostRequest.class);

➡️ Deserialization
 */
