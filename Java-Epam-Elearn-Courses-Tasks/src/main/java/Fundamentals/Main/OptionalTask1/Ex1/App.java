package Fundamentals.Main.OptionalTask1.Ex1;

import Fundamentals.Main.OptionalTask1.ValuesFromConsole;

/**
 * Ввести n чисел с консоли.
 * Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */

public class App {
    public static void main(String[] args) {
        int[] values = ValuesFromConsole.numsFromConsole();

        int[] shortLongValues1 = ShortLong.shortLong_Array(values);
        int[] shortLongValues2 = ShortLong.shortLong_Stream(values);

        System.out.println("With Arrays:");
        System.out.println("Самое короткое = " + shortLongValues1[0] + ", длина = " + String.valueOf(shortLongValues1[0]).length());
        System.out.println("Самое длинное = " + shortLongValues1[1] + ", длина = " + String.valueOf(shortLongValues1[1]).length());
        System.out.println("------------------");

        System.out.println("With Streams:");
        System.out.println("Самое короткое = " + shortLongValues2[0] + ", длина = " + String.valueOf(shortLongValues2[0]).length());
        System.out.println("Самое длинное = " + shortLongValues2[1] + ", длина = " + String.valueOf(shortLongValues2[1]).length());
        System.out.println("------------------");
    }
}
