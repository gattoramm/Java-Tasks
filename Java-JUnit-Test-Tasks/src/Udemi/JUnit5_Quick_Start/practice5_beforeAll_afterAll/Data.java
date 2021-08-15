package Udemi.JUnit5_Quick_Start.practice5_beforeAll_afterAll;

import java.util.ArrayList;

public class Data {
    public static int findLargest(ArrayList<Integer> nums) {
        int largest = nums.get(0);

        for (int number : nums) {
            if (number > largest)
                largest = number;
        }

        return largest;
    }
}
