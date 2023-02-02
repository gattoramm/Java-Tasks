package leetCode.Arrays.arr3;

public class Solution {
    private static int findMin(int[] nums) {
        int indx = 0;
        for (int i = 0; i < nums.length & nums[indx] < 0; i++)
            indx = i;

        if (indx != 0 && nums[indx] > -nums[indx - 1])
            indx--;

        return indx;
    }

    private static int[] newNums(int[] nums) {
        int len = nums.length;
        int md = findMin(nums);
        int[] result = new int[len];

        if (md == 0)
            result = nums;
        else if (md == len - 1)
            for (int i = 0; i < len; i++)
                result[i] = nums[len - 1 - i];
        else {
            result[0] = nums[md];
            int k = 1;

            int left = md - 1; int right = md + 1;

            while (left > -1 & right < len)
                result[k++] = -nums[left] < nums[right] ? nums[left--] : nums[right++];

            if (left == -1)
                for (int i = k; i < len; i++)
                    result[i] = nums[i];

            if (right == len)
                for (int i = k; i < len; i++)
                    result[i] = nums[left - i + k];
        }

        return result;
    }

    private static int[] square(int[] nums) {
        int[] squareNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            squareNums[i] = nums[i]*nums[i];

        return squareNums;
    }

    public static void main(String[] args) {
//        int[] n5 = {-1};
//        int[] n2 = {-2, 2};
//        int[] n3 = {-79, -5, -4, -3, -2, 3, 4, 6, 60, 119};
//        int[] n5 = {-4,-1,0,3,10};
        int[] n5 = {-5,-3,-2,-1};
//        int[] n5 = {0, 2};
//        int[] n5 = {-1,2,2};
//        int[] n5 = {-1,0,4,4};

        int[] sortNums5 = newNums(n5);

        for (int i : square(sortNums5)) System.out.println(i);
    }
}
