package Fundamentals.Main.OptionalTask1.Ex2;

import java.util.Arrays;

class Sorted {
    public static int[] sortedByLength_Array(int[] nums) {
        if (nums == null)
            return null;

        int[] lenValues = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
            lenValues[i] = String.valueOf(nums[i]).length();

        // сортировка вставкой
        for (int out = 1; out < nums.length; out++) {
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
}
