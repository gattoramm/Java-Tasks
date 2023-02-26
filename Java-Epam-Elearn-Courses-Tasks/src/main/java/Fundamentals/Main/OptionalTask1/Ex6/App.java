package Fundamentals.Main.OptionalTask1.Ex6;

import Fundamentals.Main.OptionalTask1.ValuesFromConsole;

/**
 * Задание. Ввести n чисел с консоли.
 * Найти число, цифры в котором идут в строгом порядке возрастания.
 * Если таких чисел несколько, найти первое из них.
 */

public class App {
    public static int increasesDigitsInNumber(int[] nums) throws NullPointerException {
        if (nums == null)
            throw new NullPointerException("Empty array");

        int result = -1;

        for (int item : nums) {
            if (String.valueOf(item).length() == 1) {
                result = item;
            }
            else {
                char[] chNums = String.valueOf(item).toCharArray();
                boolean charsInWordIncrease = true;

                for (int j = 1; j < chNums.length; j++) {
                    charsInWordIncrease =
                            Integer.parseInt(String.valueOf(chNums[j])) >
                            Integer.parseInt(String.valueOf(chNums[j - 1]));
                }
                if (charsInWordIncrease) {
                    result = item;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws NullPointerException{
        int[] values = ValuesFromConsole.numsFromConsole();
        int result = increasesDigitsInNumber(values);
        System.out.println(result);
    }
}
