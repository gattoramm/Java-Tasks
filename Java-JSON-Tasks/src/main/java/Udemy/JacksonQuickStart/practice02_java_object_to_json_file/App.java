package Udemy.JacksonQuickStart.practice02_java_object_to_json_file;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

//convert a custom Java object to a JSON file

public class App {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BasketballPlayer player = new BasketballPlayer("Tom", 30);

        String path = "outfile.json";
        mapper.writeValue(new File(path), player);
    }
}

class BasketballPlayer {
    public String name;
    public int number;

    public BasketballPlayer(String name, int number) {
        this.name = name;
        this.number = number;
    }
}