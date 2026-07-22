package DemoSerialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

public class Basics_Serialization {


    @Test
    public void  m1() throws JsonProcessingException {
        DemoPojoPostRequest data = new DemoPojoPostRequest(); // pojo Class Obj
        data.setName("Scott901q");
        data.setEmail("Test1q231@yopmail.com");
        data.setGender("male");
        data.setStatus("Active");

        // convert Java Object to JsonObject => Serialization


        // Serialization
        // Convert Java Object → JSON

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(data);
        System.out.println(jsonData);

        DemoPojoPostRequest javaObject =  objectMapper.readValue(jsonData, DemoPojoPostRequest.class);
        System.out.println("Name: " + javaObject.getName());
        System.out.println("Email: " + javaObject.getEmail());
        System.out.println("Status: " + javaObject.getStatus());
        System.out.println("Gender: " + javaObject.getGender());

    }
}
