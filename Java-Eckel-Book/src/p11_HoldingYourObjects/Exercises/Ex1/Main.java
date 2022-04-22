package p11_HoldingYourObjects.Exercises.Ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbil = new ArrayList<>();
        for(int index=0; index<10; index++)
            gerbil.add(new Gerbil(index));
        for(Gerbil item : gerbil)
            System.out.println(item.hop());
    }
}
