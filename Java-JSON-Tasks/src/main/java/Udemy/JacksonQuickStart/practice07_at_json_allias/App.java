package Udemy.JacksonQuickStart.practice07_at_json_allias;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.*;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        String jsonString =
            "{\"brandName\":\"Honda\",\"type\":\"Accord\",\"color\":\"red\"}";

        ObjectMapper mapper = new ObjectMapper();

        Car car = mapper.readValue(jsonString, Car.class);

        System.out.println("brand = " + car.brand);
        System.out.println("model = " + car.model);
        System.out.println("color = " + car.color);
    }
}

class Car {
    @JsonAlias({"brandName", "brand_name", "myBrandName"})
    public String brand;

    @JsonAlias({"type"})
    public String model;

    public String color;
}