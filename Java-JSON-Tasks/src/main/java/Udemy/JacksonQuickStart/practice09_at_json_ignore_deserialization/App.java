package Udemy.JacksonQuickStart.practice09_at_json_ignore_deserialization;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        String jsonString =
                "{ \"countryOfOrigin\":\"Brazil\", \"color\":\"yellow\", \"quantity\":20}";
        ObjectMapper mapper = new ObjectMapper();
        Banana banana = mapper.readValue(jsonString, Banana.class);

        System.out.println("countyOfOrigin: " + banana.countryOfOrigin);
        System.out.println("color: " + banana.color);
        System.out.println("quantity: " + banana.quantity);
        System.out.println("inSeason: " + banana.inSeason);
    }
}

class Banana {
    public String countryOfOrigin;
    public String color;
    @JsonIgnore
    public int quantity = 4;
    public boolean inSeason = true;
}