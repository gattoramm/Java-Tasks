package Fundamentals.Main.OptionalTask1.Ex1;

import Fundamentals.Main.OptionalTask1.ValuesFromConsole;

/**
 * Ввести n чисел с консоли.
 * Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */

public class App {
    public static int[] minMax(int[] nums) {
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
//        int[] lenValues = new int[count];
//        for (int i = 0; i < count; i++)
//            lenValues[i] = String.valueOf(values[i]).length();
//
//        int valueOfMinLen = values[0], valueOfMaxLen = values[0];
//        int minLen = lenValues[0], maxLen = lenValues[0];
//
//        for (int i = 0; i < count; i++) {
//            if (lenValues[i] < minLen) {
//                minLen = lenValues[i];
//                valueOfMinLen = values[i];
//            }
//            if (lenValues[i] > maxLen) {
//                maxLen = lenValues[i];
//                valueOfMaxLen = values[i];
//            }
        System.out.println("Самое короткое = " + resMinMax[0] + ", длина = " + String.valueOf(resMinMax[0]).length());
        System.out.println("Самое длинное = " + resMinMax[1] + ", длина = " + String.valueOf(resMinMax[1]).length());
        }
}
