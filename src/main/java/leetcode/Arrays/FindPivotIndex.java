package leetcode.Arrays;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/running-sum-of-1d-array/
 */
public class FindPivotIndex {
    public static void main(String[] args) {
        int result = pivotIndex(new int[]{2, 1, -1});
        System.out.print(result);
    }

    static int pivotIndex(int[] nums) {

        int sum = 0;
        int leftSum = 0;

        for (int num : nums) {
            sum = sum + num;
        }

        for (int i = 0; i < nums.length; i++) {

            int temp = (sum - leftSum) - nums[i];

            if (leftSum == temp) {
                return i;
            }

            leftSum = nums[i] + leftSum;
        }

        return -1;

    }
}
