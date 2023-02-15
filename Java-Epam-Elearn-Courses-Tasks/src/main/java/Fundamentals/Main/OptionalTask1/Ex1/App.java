package Fundamentals.Main.OptionalTask1.Ex1;

import Fundamentals.Main.OptionalTask1.ValuesFromConsole;

/**
 * Ввести n чисел с консоли.
 * Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */

public class App {
    public static int[] shortLong(int[] nums) {
        if (nums == null) return null;

        int lenOfValue = String.valueOf(nums[0]).length();
        int minLen = lenOfValue, maxLen = lenOfValue;
        int shortValue = nums[0], longValue = nums[0];

        for (int item:nums) {
            lenOfValue = String.valueOf(item).length();

            if (minLen > lenOfValue) {
                minLen = lenOfValue;
                shortValue = item;
            }
            if (maxLen <= lenOfValue) {
                maxLen = lenOfValue;
                longValue = item;
            }
        }
        return new int[]{shortValue, longValue};
    }

    public static void main(String[] args) {
        int[] values = ValuesFromConsole.numsFromConsole();

        int[] resMinMax = shortLong(values);

        System.out.println("Самое короткое = " + resMinMax[0] + ", длина = " + String.valueOf(resMinMax[0]).length());
        System.out.println("Самое длинное = " + resMinMax[1] + ", длина = " + String.valueOf(resMinMax[1]).length());
        }
}
