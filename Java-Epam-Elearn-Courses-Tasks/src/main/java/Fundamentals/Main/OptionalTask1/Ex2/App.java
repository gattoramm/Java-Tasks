package Fundamentals.Main.OptionalTask1.Ex2;

import Fundamentals.Main.OptionalTask1.ValuesFromConsole;

import static Fundamentals.Main.OptionalTask1.Ex2.Sorted.sortedByLength_Array;

/**
 * Ввести n чисел с консоли.
 * Вывести числа в порядке возрастания (убывания) значений их длины.
 */

public class App {
    public static void main(String[] args) {
        int[] values = ValuesFromConsole.numsFromConsole();
        int[] res =  sortedByLength_Array(values);

        for (int item : res)
            System.out.println(item);
    }
}
