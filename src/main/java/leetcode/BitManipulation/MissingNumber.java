package leetcode.BitManipulation;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {
    public static void main(String[] args) {
        int result = missingNumber2(new int[]{3, 0, 1});
        System.out.print(result);
    }

    static int missingNumber(int[] nums) {
        // init res = arr.len because range is [0,res] and it will not get as value inside loop
        // due to out of bound. so init with it and XOR
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ i ^ nums[i]; // a^b^b = a
        }
        return res;
    }

    // 2nd approach. sum and subtract
    static int missingNumber2(int[] nums) {
        int sum = nums.length;
        for (int i = 0; i < nums.length; i++)
            sum += i - nums[i]; //// a+b-b = a
        return sum;
    }
}
