package leetcode.Arrays;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSumTwoPointers {
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.print(Arrays.toString(result));
    }

    static int[] twoSum(int[] numbers, int target) {

        //considering inout array is sorted
        int start = 0;
        int end = numbers.length - 1;
        int[] result = new int[2];

        while (start < end) {
            int value = numbers[start] + numbers[end];
            if (value == target) {
                result[0] = start+1;
                result[1] = end+1;
                break;
            } else if (value < target) {
                start++;
            } else {
                end--;
            }
        }
        return result;
    }
}
