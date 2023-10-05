package Collection.Set;

import java.util.*;

public class Reserved {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("A");
        set.add("B");
        set.add("C");

        NavigableSet<String> navSet = set.descendingSet();
        System.out.println(navSet);
    }
}
