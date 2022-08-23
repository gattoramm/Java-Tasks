package leetCode.Two_Sum;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int lowIndex = 0;
        int highIndex = nums.length-1;

        int a = nums[0];
        int b = nums[1];

        while (lowIndex <= highIndex | a + b != target) {
            int midIndex = (lowIndex + highIndex) / 2;
            if (nums[midIndex] > target | nums[midIndex] + nums[midIndex] > target)
                highIndex = midIndex;
            else {

            }
        }








        return new int[]{nums[1], nums[2]};
    }
    public static void main(String[] args) {

    }

}
