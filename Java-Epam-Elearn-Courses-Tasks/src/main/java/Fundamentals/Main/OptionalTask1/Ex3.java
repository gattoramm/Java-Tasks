package Fundamentals.Main.OptionalTask1;

import java.util.Scanner;

/**
 * Ввести n чисел с консоли.
 * Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
 */

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int count= scanner.nextInt();

        int[] values = new int[count];
        for (int i = 0; i < count; i++)
            values[i] = scanner.nextInt();

        int[] lenValues = new int[count];
        for (int i = 0; i < count; i++)
            lenValues[i] = String.valueOf(values[i]).length();

        int meanLength = 0;

        for (int i = 0; i < count; i++)
            meanLength += lenValues[i];

        meanLength /= count;

        System.out.println("Mean: " + meanLength);

        for (int i = 0; i < count; i++) {
            if (lenValues[i] > meanLength)
                System.out.println("value = " + values[i] + ", len: " + lenValues[i]);
        }
    }
}
