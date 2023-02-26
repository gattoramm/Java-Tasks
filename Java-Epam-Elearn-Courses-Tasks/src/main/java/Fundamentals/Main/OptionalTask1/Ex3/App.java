package Fundamentals.Main.OptionalTask1.Ex3;

import Fundamentals.Main.OptionalTask1.ValuesFromConsole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ввести n чисел с консоли.
 * Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
 */

public class App {
    public static void main(String[] args) {
        int[] values = ValuesFromConsole.numsFromConsole();
        int[] res1 = Median.valuesMoreThatMedianWithArray(values);
        int[] res2 = Median.valuesMoreThatMedianWithArrayList(values);
        int[] res3 = Median.valuesMoreThatMedianWithStream(values);

        System.out.println("With arrays:");
        for (int item : res1)
            System.out.println("Value: " + item + ", len: " + String.valueOf(item).length());
        System.out.println("------------------");

        System.out.println("With ArrayList:");
        for (int item : res2)
            System.out.println("Value: " + item + ", len: " + String.valueOf(item).length());
        System.out.println("------------------");

        System.out.println("With Stream:");
        for (int item : res3)
            System.out.println("Value: " + item + ", len: " + String.valueOf(item).length());
        System.out.println("------------------");
    }
}
