package leetCode.Arrays.arr3;

public class Solution2 {
    public static int[] solve(int[] nums) {
        int len = nums.length;

        int left = 0;
        int right = len;

        int[] result = new int[len];

        int indx = 0;

        while (left < len & right > 0) {
            int l2 = nums[left] * nums[left];
            int r2 = nums[right] * nums[right];

            if (l2 <= r2) {
                result[indx++] = l2;
                left++;
            }
            else {
                result[indx++] = r2;
                right--;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] n = {-1};
//        int[] n = {-2, 2};
//        int[] n = {-79, -5, -4, -3, -2, 3, 4, 6, 60, 119};
//        int[] n = {-4,-1,0,3,10};
//        int[] n = {-5,-3,-2,-1};
//        int[] n = {0, 2};
//        int[] n = {-1,2,2};
//        int[] n = {-1,0,4,4};

        int[] sortNums = solve(n);

        for (int i : sortNums) System.out.println(i);
    }
}
