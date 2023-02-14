package Fundamentals.Main.OptionalTask1.Ex6;

import java.util.Scanner;

/**
 * Задание. Ввести n чисел с консоли
 * Найти число, цифры в котором идут в строгом порядке возрастания.
 * Если таких чисел несколько, найти первое из них.
 */

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countValues = scanner.nextInt();

        for (int i = 0; i < countValues; i++) {
            int num = scanner.nextInt();
            char[] chNums = String.valueOf(num).toCharArray();

            boolean charsInWordIncrease = true;

            for (int j = 1; j < chNums.length; j++) {
                int num1 = Integer.parseInt(String.valueOf(chNums[j]));
                int num2 = Integer.parseInt(String.valueOf(chNums[j - 1]));
                if (num1 <= num2)
                    charsInWordIncrease = false;
            }

            if (charsInWordIncrease)
                System.out.println(num);
        }
    }
}
