package Udemy.JacksonQuickStart.practice10_object_within_object_serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        Car car = new Car();
        car.model = "Ford";
        car.engine.cylinders = 8;
        car.engine.horsepower = 125;

        String jsonString = mapper.writeValueAsString(car);

        System.out.println(jsonString);
    }
}

class Car {
    public String model;
    public Engine engine = new Engine();
}

class Engine {
    public int cylinders;
    public int horsepower;
}