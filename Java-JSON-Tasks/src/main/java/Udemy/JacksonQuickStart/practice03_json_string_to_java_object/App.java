package Udemy.JacksonQuickStart.practice03_json_string_to_java_object;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        String jsonString = "{ \"name\":\"Sally\", \"number\":20 }";
        ObjectMapper mapper = new ObjectMapper();
        VolleyballPlayer player = mapper.readValue(jsonString, VolleyballPlayer.class);

        System.out.println("name: " + player.name);
        System.out.println("number: " + player.number);
    }
}

class VolleyballPlayer {
    public String name;
    public int number;
}