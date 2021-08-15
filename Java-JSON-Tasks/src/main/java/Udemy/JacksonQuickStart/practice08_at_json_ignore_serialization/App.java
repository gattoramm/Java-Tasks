package Udemy.JacksonQuickStart.practice08_at_json_ignore_serialization;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class App{
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        Apple apple = new Apple();
        apple.countryOfOrigin = "United States";
        apple.color = "red";
        apple.quantity = 10;

        String jsonString = mapper.writeValueAsString(apple);

        System.out.println(jsonString);
    }
}

class Apple {
    @JsonIgnore
    public String countryOfOrigin;
    public String color;
    public int quantity;
}