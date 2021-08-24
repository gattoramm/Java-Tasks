package part5.Initialization.ArrayInit;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
    public static void main(String[] args) {
        int[] a = new int[new Random().nextInt(20)];;

        System.out.println("Length of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
