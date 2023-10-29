package leetcode.Arrays;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] result = plusOne(new int[]{4, 9, 9});
        System.out.print(Arrays.toString(result));
    }

    static int[] plusOne(int[] digits) {

        int end = digits.length - 1;

        for (int i = end; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        if (digits[0] == 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }


        return digits;
    }
}
