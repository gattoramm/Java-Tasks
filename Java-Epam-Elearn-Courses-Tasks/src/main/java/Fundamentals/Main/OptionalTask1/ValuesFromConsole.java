package Fundamentals.Main.OptionalTask1;

import java.util.Scanner;

public class ValuesFromConsole {
    public static int[] numsFromConsole() {
        int count = 0;
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Введите количество чисел: ");
            count = scanner.nextInt();

            int[] values = new int[count];

            System.out.print("Введите числа через Enter:\n");
            for (int i = 0; i < count; i++)
                values[i] = scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }

        return values;
    }
}
