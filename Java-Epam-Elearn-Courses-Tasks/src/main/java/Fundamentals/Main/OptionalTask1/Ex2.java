package Fundamentals.Main.OptionalTask1;

import java.util.Scanner;

/**
 * Ввести n чисел с консоли.
 * Вывести числа в порядке возрастания (убывания) значений их длины.
 */

public class Ex2 {

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

        // сортировка вставкой
        for (int out = 1; out < count; out++) {
            int in = out;
            int tempLenValue = lenValues[out];
            int tempValue = values[out];

            while (in>0 && lenValues[in-1] > tempLenValue) {
                lenValues[in] = lenValues[in-1];
                values[in] = values[in-1];
                in--;
            }
            lenValues[in] = tempLenValue;
            values[in] = tempValue;
        }

        for (int v : values)
            System.out.println(v);
    }
}
