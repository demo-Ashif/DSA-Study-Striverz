package leetcode.Arrays;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/running-sum-of-1d-array/
 */
public class RunningSum {
    public static void main(String[] args) {
        moveZeroes(new int[]{3,1,2,10,1});
//        System.out.print(Arrays.toString(result));
    }

    static void moveZeroes(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];
            nums[i] = sum;

        }

        System.out.println(Arrays.toString(nums));
    }
}
