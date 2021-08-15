package Udemy.JacksonQuickStart.practice11_object_within_object_deserialization;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        String jsonString =
                "{ \"make\":\"Dell\", \"model\":\"Game Max\"," +
                        "\"myProcessor\":{\"processorName\":\"Intel i7\", \"speed\":2200, \"numberOfCores\":8}}";

        ObjectMapper mapper = new ObjectMapper();
        Computer computer = mapper.readValue(jsonString, Computer.class);

        System.out.println("name: " + computer.make);
        System.out.println("model: " + computer.model);
        System.out.println("processorName: " + computer.myProcessor.processorName);
        System.out.println("speed: " + computer.myProcessor.speed);
        System.out.println("numberOfCores: " + computer.myProcessor.numberOfCores);
        System.out.println("inStock: " + computer.myProcessor.inStock);
    }
}

class Computer {
    public String make;
    public String model;
    public Processor myProcessor = new Processor();
}

class Processor {
    public String processorName;
    public int speed;
    public int numberOfCores    ;

    public boolean inStock = true;
}
