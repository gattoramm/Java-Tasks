package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reversed {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("a", "b", "c");

        Collections.reverse(list);
        System.out.println(list);
    }
}
