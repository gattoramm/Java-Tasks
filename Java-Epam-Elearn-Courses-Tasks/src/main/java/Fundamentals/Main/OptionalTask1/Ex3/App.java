package Fundamentals.Main.OptionalTask1.Ex3;

import Fundamentals.Main.OptionalTask1.ValuesFromConsole;

/**
 * Ввести n чисел с консоли.
 * Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
 */

public class App {
    public static int[] valuesMoreThatMedian(int[] nums) {
        if (nums == null) return null;

        int count = nums.length;

        int meanLength = 0;

        for (int num : nums)
            meanLength += String.valueOf(num).length();

        meanLength /= count;

        int countLengthLessThatMedian = 0;

        for (int num : nums)
            countLengthLessThatMedian += String.valueOf(num).length() <= meanLength ? 1 : 0;

        int[] result = new int[countLengthLessThatMedian];

        int innerCount = 0;

        for (int item: nums)
            if (String.valueOf(item).length() <= meanLength)
                result[innerCount++] = item;

        return result;
    }

    public static void main(String[] args) {
        int[] values = ValuesFromConsole.numsFromConsole();
        int[] res = valuesMoreThatMedian(values);

        for (int item : res)
            System.out.println("Value: " + item + ", len: " + String.valueOf(item).length());
    }
}
