package Fundamentals.Main.OptionalTask1;

import java.util.Scanner;

/**
 * Задание. Ввести n чисел с консоли
 * Найти количество чисел, содержащих только четные цифры, а среди оставшихся —
 * количество чисел с равным числом четных и нечетных цифр.
 */

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countValues = scanner.nextInt();
        int[] values = new int[countValues];

        int i = 0;
        do {
            values[i] = scanner.nextInt();
            i++;
        } while (i < countValues);

        for (int value : values) {
            char[] chrValue = String.valueOf(value).toCharArray();

            int countOdd = 0;
            int countEven = 0;

            for (char ch : chrValue) {
                if (Integer.parseInt(String.valueOf(ch)) % 2 == 0) countEven++;
                else countOdd++;
            }
            if (countEven == chrValue.length)
                System.out.println("ALL EVEN! num = " + value);
            if (countEven == countOdd)
                System.out.println("EVEN = ODD! num = " + value);
        }
    }
}
