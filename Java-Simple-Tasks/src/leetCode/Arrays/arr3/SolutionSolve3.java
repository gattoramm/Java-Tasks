package leetCode.Arrays.arr3;

public class SolutionSolve3 {
    public static int[] sortedSquares(int[] nums) {
        int left = findLastNegativeNum(nums);
        int right = left + 1;
        int[] sortedArray = new int[nums.length];

        for (int i = 0; i < sortedArray.length; i++) {
            if (left >= 0 && (right == nums.length || Math.abs(nums[left]) <= nums[right]))
                sortedArray[i] = nums[left] * nums[left--];
            else
                sortedArray[i] = nums[right] * nums[right++];
        }
        return sortedArray;
    }

    private static int findLastNegativeNum(int[] nums) {
        int indx = 0;

        for (int i = 0; i < nums.length & nums[indx] < 0; i++)
            indx = i;

        return indx;
    }

    public static void main(String[] args) {
        int[] n = {-79, -5, -4, -3, -2, 3, 4, 6, 60, 119};
//        int[] n = {-4,-1,0,3,10};
//        int[] n = {-5,-3,-2,-1};
//        int[] n = {0, 2};
//        int[] n = {-1,2,2};
//        int[] n = {-1,0,4,4};

        int[] sortNums = sortedSquares(n);

        for (int i : sortNums) System.out.println(i);
    }
}
