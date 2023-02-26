package Fundamentals.Main.OptionalTask1.Ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Median {
    public static int[] valuesMoreThatMedianWithArray(int[] nums) {
        if (nums == null)
            return null;

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

    public static int[] valuesMoreThatMedianWithArrayList(int[] nums) {
        if (nums == null)
            return null;

        int meanLength = 0;

        for (int num : nums)
            meanLength += String.valueOf(num).length();

        meanLength /= nums.length;

        List<Integer> result = new ArrayList<>();

        for (int num : nums)
            if (String.valueOf(num).length() <= meanLength)
                result.add(num);

        int[] ret = new int[result.size()];
        for (int i = 0; i < ret.length; i++)
            ret[i] = result.get(i);

        return ret;
    }

    public static int[] valuesMoreThatMedianWithStream(int[] nums) {
        if (nums == null)
            return null;

        int average =  (int) Arrays.stream(nums)
                .mapToObj(i -> ((Integer) i).toString())
                .mapToInt(String::length)
                .average().orElse(Double.NaN);

        return Arrays.stream(nums)
                .filter(i -> ((Integer) i).toString().length() <= average)
                .toArray();
    }
}
