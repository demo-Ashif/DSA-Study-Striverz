package study.BitManipulation;

import java.util.Scanner;

public class TwoNonRepeatingElements {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 3, 2, 7};
        findTwoNonRepeatingElements(arr);
    }

    private static void findTwoNonRepeatingElements(int[] nums) {
        int sum = 0;
        for (int j : nums) {
            // XOR will give output of A ^ B (A and B is two different number)
            sum = (sum ^ j);
        }

        // now will find right most set bit by conventional way
        int lowestBit = sum & (-sum);

        // now create a array of 2 elements so that we can
        // keep numbers in two different groups
        int[] result = new int[2];

        // traversing the array again
        for (int num : nums) {

            // one group is with set bit 1 in lowest bit
            // another group is O in lowest bit
            //always check with 0 as checker e.g 0 is always 0 but (num & lowestBit) == 4 sometimes
            if ((num & lowestBit) == 0) {
                result[0] = result[0] ^ num;
            } else {
                result[1] = result[1] ^ num;
            }
        }

        // print the two unique numbers
        System.out.println("The non-repeating elements are "
                + result[0] + " and " + result[1]);
    }


}
