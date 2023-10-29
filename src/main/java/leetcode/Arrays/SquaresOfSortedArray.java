package leetcode.Arrays;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] result = sortedSquares(new int[]{-4, -1, 0, 3, 10});
        System.out.print(Arrays.toString(result));
    }

    static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int resultIndex = right;


        while (left <= right) {
            int leftVal = Math.abs(nums[left]);
            int rightVal = Math.abs(nums[right]);

            if (leftVal >= rightVal) {
                result[resultIndex] = leftVal * leftVal;
                left++;
            } else {
                result[resultIndex] = rightVal * rightVal;
                right--;
            }

            resultIndex--;
        }

        return result;

    }
}
