package Fundamentals.Main.OptionalTask1;

import java.util.Scanner;

public class ValuesFromConsole {
    public static int[] numsFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");

        int count = scanner.nextInt();

        int[] values = new int[count];

        System.out.print("Введите числа через Enter:\n");

        for (int i = 0; i < count; i++)
            values[i] = scanner.nextInt();

        return values;
    }
}
