package Fundamentals.Main.OptionalTask1.Ex4;

import Fundamentals.Main.OptionalTask1.ValuesFromConsole;

/**
 * Ввести n чисел с консоли.
 * Найти число, в котором количество различных цифр минимально.
 * Если таких чисел несколько, найти первое из них.
 */

public class App {
    public static int differentDigitsInNumber(int[] nums) throws NullPointerException {
        final int N = 10;
        if (nums == null)
            throw new NullPointerException("Empty array");

        int[] frequencyDigits;
        int counterOfDigits = N;
        int numberWithMinimalDifferentDigits = nums[0];
        int sign;

        for (int item : nums) {
            sign = item < 0 ? -1 : 1;

            char[] chDigits = String.valueOf(item * sign).toCharArray();
            frequencyDigits = new int[N];
            int innerCounterOfDigits = 0;

            for (char itemChar: chDigits)
                frequencyDigits[Integer.parseInt(String.valueOf(itemChar))]++;

            for (int itemFreq : frequencyDigits)
                if (itemFreq != 0)
                    innerCounterOfDigits++;

            if (counterOfDigits > innerCounterOfDigits) {
                counterOfDigits = innerCounterOfDigits;
                numberWithMinimalDifferentDigits = item;
            }
        }
        return numberWithMinimalDifferentDigits;
    }

    public static void main(String[] args) throws NullPointerException {
        int[] values = ValuesFromConsole.numsFromConsole();
        long res = differentDigitsInNumber(values);
        System.out.println(res);
    }
}
