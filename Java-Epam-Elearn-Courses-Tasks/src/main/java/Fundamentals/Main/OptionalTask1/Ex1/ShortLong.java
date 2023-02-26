package Fundamentals.Main.OptionalTask1.Ex1;

import java.util.Arrays;

class ShortLong {
    public static int[] shortLong_Array(int[] nums) {
        if (nums == null)
            return null;

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

    public static int[] shortLong_Stream(int[] nums) {
        if (nums == null)
            return null;

        int[] numsString = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            numsString[i] = String.valueOf(nums[i]).length();

        int shortLengthNum = Arrays.stream(nums)
                .mapToObj(i -> ((Integer) i).toString())
                .mapToInt(String::length)
                .min().orElseThrow();

        int longLengthNum = Arrays.stream(nums)
                .mapToObj(i -> ((Integer) i).toString())
                .mapToInt(String::length)
                .max().orElseThrow();

        int shortNum = Arrays.stream(nums)
                .filter(x->((Integer) x).toString().length() == shortLengthNum)
                .findFirst().orElseThrow();

        int longNum = Arrays.stream(nums)
                .filter(x->((Integer) x).toString().length() == longLengthNum)
                .findFirst().orElseThrow();

        return new int[]{shortNum, longNum};
    }
}
