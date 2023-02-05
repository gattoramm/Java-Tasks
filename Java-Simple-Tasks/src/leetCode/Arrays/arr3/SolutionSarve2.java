package leetCode.Arrays.arr3;

public class SolutionSarve2 {
    public static int[] sortedSquares(int[] nums) {
        int psize = 0; int nsize = 0;

        for (int num : nums)
            if (num < 0) nsize++;
            else psize++;

        int[] parr = new int[psize];
        int[] narr = new int[nsize];

        int j = 0; int k = 0;

        for (int i = nsize - 1; i >= 0; i--, j++)
            narr[i] = nums[j] * nums[j];

        for (int i = nsize; i < nums.length; i++)
            parr[k++] = nums[i] * nums[i];

        int[] ans = new int[nums.length];
        j = 0; k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (j == nsize)
                ans[i] = parr[k++];

            else if (k == psize)
                ans[i] = narr[j++];

            else if (j < nsize && k < psize && narr[j] < parr[k])
                ans[i] = narr[j++];

            else if (j < nsize && k < psize && narr[j] >= parr[k])
                ans[i] = parr[k++];
        }

        return ans;
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
