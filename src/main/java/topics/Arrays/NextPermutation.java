package topics.Arrays;

import topics.Formulas.AllPermutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 5, 4, 3, 0, 0};

        nextGreaterPermutation(nums);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");
    }

    //Intuition:
    // 1. Find the breakpoint where number goes in decrement
    // 2. Place number which higher than breakpoint number and lower than other numbers
    // 3. Place numbers in sorted way (lower to higher for all remaining numbers
    static void nextGreaterPermutation(int[] nums) {

        int n = nums.length;

        int index = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // break point doesn't exist, so it's the last permutation
        if (index == -1) {
            reverseSuffix(nums, 0);
        } else {
            // got breakpoint.
            // 1. Find next greater element
            // 2. swap value then reverse
            // 3. Break and reverse

            for (int i = n - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    swap(nums, i, index);
                    break;
                }
            }
            // Step 3: reverse the right half:
            reverseSuffix(nums, index + 1);
        }

    }

    /**
     * Reverse numbers starting from an index till the end.
     */
    static void reverseSuffix(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
