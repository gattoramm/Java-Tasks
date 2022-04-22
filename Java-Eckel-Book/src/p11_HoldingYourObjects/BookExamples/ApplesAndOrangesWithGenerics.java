package p11_HoldingYourObjects.BookExamples;

import java.util.*;

public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for(int i=0; i<3; i++)
            apples.add(new Apple());
        //apples.add(new Orange());
        for(int i=0; i< apples.size(); i++)
            System.out.println((apples.get(i)).id());
        for(Apple item : apples)
            System.out.println(item.id());
    }
}
