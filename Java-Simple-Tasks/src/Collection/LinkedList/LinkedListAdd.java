package Collection.LinkedList;

import java.util.LinkedList;

public class LinkedListAdd {

    public static void main(String[] args) {

        String str1 = "Hello World!";
        String str2 = "My name is Earl";
        String str3 = "I love Java";
        String str4 = "I live in Moscow";

        LinkedList<String> earlBio = new LinkedList<>();

        earlBio.add(str1);
        earlBio.add(str3);
        earlBio.add(1, str2);

        System.out.println(earlBio);

    }

}
