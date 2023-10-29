package leetcode.BitManipulation;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/counting-bits/
 */
public class CountingBits {
    public static void main(String[] args) {
        int[] result = countBits(5);
        System.out.print(Arrays.toString(result));
    }

    static int[] countBits(int n) {

        int[] result = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            result[i] = countBitsOfNumber(i);
        }

        return result;
    }

    static int countBitsOfNumber(int n) {
        int bitCount = 0;
        while (n != 0) {
            n = n & (n - 1);
            bitCount++;
        }

        return bitCount;
    }
}
