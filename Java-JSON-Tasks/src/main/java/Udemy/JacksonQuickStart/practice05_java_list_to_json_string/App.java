package Udemy.JacksonQuickStart.practice05_java_list_to_json_string;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        List<String> list = new ArrayList<>();
        list.add("milk");
        list.add("oranges");
        list.add("tea");
        list.add("bulbs");

        String jsonString = mapper.writeValueAsString(list);

        System.out.println(jsonString);
    }
}
