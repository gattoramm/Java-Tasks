package Fundamentals.Main.OptionalTask1;

import java.util.Scanner;

/**
 * Ввести n чисел с консоли.
 * Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int count= scanner.nextInt();

        int[] values = new int[count];
        for (int i = 0; i < count; i++) {
            values[i] = scanner.nextInt();
        }

        int[] lenValues = new int[count];
        for (int i = 0; i < count; i++) {
            lenValues[i] = String.valueOf(values[i]).length();
        }

        int valueOfMinLen = values[0], valueOfMaxLen = values[0];
        int minLen = lenValues[0], maxLen = lenValues[0];

        for (int i = 0; i < count; i++) {
            if (lenValues[i] < minLen) {
                minLen = lenValues[i];
                valueOfMinLen = values[i];
            }
            if (lenValues[i] > maxLen) {
                maxLen = lenValues[i];
                valueOfMaxLen = values[i];
            }
        }

        System.out.println("Самое короткое = " + valueOfMinLen + ", длина = " + minLen);
        System.out.println("Самое длинное = " + valueOfMaxLen + ", длина = " + maxLen);
    }
}
