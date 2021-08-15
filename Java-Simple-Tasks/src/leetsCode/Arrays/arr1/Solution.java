package leetsCode.Arrays.arr1;
/*первые 2 или последние 3*/
public class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {

        if(nums.length > 3) {
            if(nums[nums.length-2] != nums[nums.length-1])
                return 1;
            else if(nums[nums.length-3] == nums[nums.length-1])
                return 3;
            else
                return 2;
        } else if(nums.length < 3)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(a));
    }

}
