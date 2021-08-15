package Udemy.JacksonQuickStart.practice04_json_file_to_java_object;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String path = "outfile.json";
        VolleyballPlayer player = mapper.readValue(new File(path), VolleyballPlayer.class);

        System.out.println("name: " + player.name);
        System.out.println("number: " + player.number);
    }
}

class VolleyballPlayer {
    public String name;
    public int number;
}