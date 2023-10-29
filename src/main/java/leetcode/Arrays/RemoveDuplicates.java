package leetcode.Arrays;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int result = removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
        System.out.print(result);
    }

    static int removeDuplicates(int[] nums) {

        if (nums.length <= 0) return 0;

        int move = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[move]) {
                move++;
                nums[move] = nums[i];
            }

        }
        return move+1;
    }
}
