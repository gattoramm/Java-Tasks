package Fundamentals.Main.OptionalTask1.Ex2;

import Fundamentals.Main.OptionalTask1.ValuesFromConsole;

/**
 * Ввести n чисел с консоли.
 * Вывести числа в порядке возрастания (убывания) значений их длины.
 */

public class App {
    public static int[] sortedByLength(int[] nums) {
        if (nums == null) return null;

        int count = nums.length;
        int[] lenValues = new int[count];

        for (int i = 0; i < count; i++)
            lenValues[i] = String.valueOf(nums[i]).length();

        // сортировка вставкой
        for (int out = 1; out < count; out++) {
            int in = out;
            int tempLenValue = lenValues[out];
            int tempValue = nums[out];

            while (in > 0 && lenValues[in - 1] > tempLenValue) {
                lenValues[in] = lenValues[in - 1];
                nums[in] = nums[in - 1];
                in--;
            }

            lenValues[in] = tempLenValue;
            nums[in] = tempValue;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] values = ValuesFromConsole.numsFromConsole();
        int[] res =  sortedByLength(values);

        for (int item : res)
            System.out.println(item);
    }
}
