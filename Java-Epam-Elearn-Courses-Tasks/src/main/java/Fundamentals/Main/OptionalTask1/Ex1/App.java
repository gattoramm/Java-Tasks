package Fundamentals.Main.OptionalTask1.Ex1;

import Fundamentals.Main.OptionalTask1.ValuesFromConsole;

/**
 * Ввести n чисел с консоли.
 * Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */

public class App {
    public static int[] minMax(int[] nums) {
        if (nums == null) return new int[]{-1, -1};

        int lenValue = String.valueOf(nums[0]).length();
        int minElem = lenValue, maxElem = lenValue;

        for (int item:nums) {
            lenValue = String.valueOf(item).length();

            if (minElem > lenValue) minElem = item;
            if (maxElem < lenValue) maxElem = item;
        }
        return new int[]{minElem, maxElem};
    }

    public static void main(String[] args) {
        int[] values = ValuesFromConsole.numsFromConsole();

        int[] resMinMax = minMax(values);

        System.out.println("Самое короткое = " + resMinMax[0] + ", длина = " + String.valueOf(resMinMax[0]).length());
        System.out.println("Самое длинное = " + resMinMax[1] + ", длина = " + String.valueOf(resMinMax[1]).length());
        }
}
