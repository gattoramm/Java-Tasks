package leetCode.Arrays.arr3;

public class Solution {
    private static int findMinPositive(int[] nums) {
        int i = 0;
        while(i < nums.length && nums[i] < 0)
            i++;

        if(i != 0 && nums[i] > -nums[i - 1])
            i--;

        return i;
    }

    private static int[] newNums(int[] nums, int indx) {
        int len = nums.length;
        int[] result = new int[len];

        result[0] = nums[indx];
        int k = 1;

        int left = indx - 1;
        int right = indx + 1;

        while (left > -1 && right < len) {
            if (-nums[left] < nums[right]) result[k] = nums[left--];
            else result[k] = nums[right++];
            k++;
        }

        if (right == len) result[k] = nums[left];
        if (left == -1) result[k] = nums[right];

        return result;
    }

    private static int[] square(int[] nums) {
        int[] squareNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            squareNums[i] = nums[i]*nums[i];
        }
        return squareNums;
    }

    public static void main(String[] args) {
        int[] n1 = {-1};

        int mm = findMinPositive(n1);
        int len = n1.length;
        int[] sortNums = new int[len];

        if (mm == 0)
            sortNums = n1;
        else if (mm == len - 1)
            for (int i = 0; i < len; i++)
                sortNums[i] = n1[len - 1 - i];
        else {
            sortNums = newNums(n1, mm);
        }

        for (int i : square(sortNums)) {
            System.out.println(i);
        }
    }
}
