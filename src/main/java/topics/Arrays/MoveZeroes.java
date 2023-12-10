package topics.Arrays;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes {
    public static void main(String[] args) {
        moveZeroes(new int[]{1, 0, 1});
    }

    static void moveZeroes(int[] nums) {
        int zeroPointer = 0;
        int mvPointer = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[mvPointer] != 0) {
                nums[zeroPointer] = nums[mvPointer];
                nums[mvPointer] = 0;
            }

            zeroPointer++;
            mvPointer++;

        }

        System.out.println(Arrays.toString(nums));
    }
}
