package Fundamentals.Main.OptionalTask1.Ex5;

import Fundamentals.Main.OptionalTask1.ValuesFromConsole;

/**
 * Задание. Ввести n чисел с консоли.
 * Найти количество чисел, содержащих только четные цифры, а среди оставшихся —
 * количество чисел с равным числом четных и нечетных цифр.
 */

public class App {
    public static int[] onlyEvenCountAndEqualOddAndEven(int[] nums) throws NullPointerException {
        if (nums == null)
            throw new NullPointerException("Empty array");

        int sign;
        int countNumbersWithOnlyEven = 0, countNumbersWithEqualOddAndEven = 0;

        for (int item : nums) {
            sign = item < 0 ? -1 : 1;
            int countOddDigits = 0, countEvenDigits = 0;

            char[] chrValue = String.valueOf(item * sign).toCharArray();

            for (char ch : chrValue) {
                if (Integer.parseInt(String.valueOf(ch)) % 2 == 0) countEvenDigits++;
                else countOddDigits++;
            }
            if (countEvenDigits == chrValue.length) countNumbersWithOnlyEven++;
            if (countEvenDigits == countOddDigits) countNumbersWithEqualOddAndEven++;
        }
        return new int[]{countNumbersWithOnlyEven, countNumbersWithEqualOddAndEven};
    }

    public static void main(String[] args) throws NullPointerException {
        int[] values = ValuesFromConsole.numsFromConsole();
        int[] res = onlyEvenCountAndEqualOddAndEven(values);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
