package Udemy.JacksonQuickStart.practice01_java_object_to_json_string;

import com.fasterxml.jackson.databind.ObjectMapper;

//convert a custom Java object to a JSON string

public class App {
    public static void main(String[] args) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        FootballPlayer footballPlayer = new FootballPlayer("Joe" , 10);
        String jsonString = mapper.writeValueAsString(footballPlayer);

        System.out.println(jsonString);
    }
}

class FootballPlayer {
    public String name;
    public int number;

    public FootballPlayer(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
