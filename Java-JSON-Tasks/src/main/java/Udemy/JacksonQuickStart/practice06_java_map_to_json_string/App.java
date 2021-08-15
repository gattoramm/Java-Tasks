package Udemy.JacksonQuickStart.practice06_java_map_to_json_string;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        Map<String, String> map = new HashMap<>();

        map.put("France", "Paris");
        map.put("Russia", "Moscow");
        map.put("Spain", "Madrid");
        map.put("Japan", "Tokyo");

        String jsonString = mapper.writeValueAsString(map);

        System.out.println(jsonString);
    }
}
