package leetCode.Arrays.arr3;


public class SolutionSolve1 {
    public static int[] sortedSquares(int[] nums) {
        int maxNum = 0;

        for (int j : nums)
            maxNum = Math.max(Math.abs(j), maxNum);

        int[] refArr = new int[maxNum + 1];
        for(int num:nums)
            refArr[Math.abs(num)]++;

        int i = 0;
        for (int num = 0; num < refArr.length; num++) {
            int count = refArr[num];
            while(count-->0)
                nums[i++] = num * num;
        }

        return nums;
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
