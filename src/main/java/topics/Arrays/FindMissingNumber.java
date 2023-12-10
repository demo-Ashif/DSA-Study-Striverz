package topics.Arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/plus-one/
 */
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 0, 1};

        int result = missingNumber(arr1);
        System.out.print(result);
    }

    public static int missingNumber(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i < nums.length; i++) {
            xor1 = xor1 ^ nums[i];
            xor2 = xor1 ^ (i + 1);
        }

        xor2 = xor2 ^ nums.length;


        return xor2;
    }
}
