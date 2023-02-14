package Fundamentals.Main.OptionalTask1;

import java.util.Scanner;

/**
 * Задание. Ввести n чисел с консоли
 * Найти число, состоящее только из различных цифр.
 * Если таких чисел несколько, найти первое из них.
 */

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countValues = scanner.nextInt();

        for (int i = 0; i < countValues; i++) {
            int num = scanner.nextInt();
            char[] chNums = String.valueOf(num).toCharArray();

            boolean charsInWordDifferent = true;
            int num1, num2;

            for (int out = 0; out < chNums.length; out++) {
                num1 = Integer.parseInt(String.valueOf(chNums[out]));
                for (int in = out+1; in < chNums.length; in++) {
                    num2 = Integer.parseInt(String.valueOf(chNums[in]));
                    if (num1 == num2)
                        charsInWordDifferent = false;
                }
            }
            if (charsInWordDifferent) {
                System.out.println(num);
                break;
            }
        }
    }
}
