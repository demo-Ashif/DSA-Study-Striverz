package topics.Arrays;

import topics.Formulas.AllPermutations;

import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> allPermutations = AllPermutations.getAllPermutations(nums);
    }

    //Intuition:
    // 1. Find the breakpoint where number goes in decrement
    // 2. Place number which higher than breakpoint number and lower than other numbers
    // 3. Place numbers in sorted way (lower to higher for all remaining numbers
    public void nextPermutation(int[] nums) {

    }
}
