package leetcode.BinarySearch;

/*
 * https://leetcode.com/problems/split-array-largest-sum/
 */

import java.util.Arrays;

public class SplitArraySum {
    public static void main(String[] args) {
        int result = splitArray(new int[]{1,2,3,4,5}, 2);
        System.out.println(result);

    }

    // brute force
    static int splitArray(int[] nums, int m) {
        int result = Integer.MAX_VALUE;

        int totalSum = 0;

        for (int num : nums) {
            totalSum = totalSum + num;
        }

        for (int i = 0; i < nums.length; i++) {
            int secondSplit = 0;
            for (int j = i + 1; j < nums.length; j++) {
                secondSplit = secondSplit + nums[j];
            }
            int tempResult = Math.max(secondSplit, (totalSum - secondSplit));
            result = Math.min(result, tempResult);

        }

        System.out.println(result);

        return -1;
    }
}
