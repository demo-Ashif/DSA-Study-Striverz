package leetcode.BitManipulation;

/*
 * https://leetcode.com/problems/number-of-1-bits/
 */
public class Number1Bits {
    public static void main(String[] args) {
        int result = hammingWeight(2);
        System.out.print(result);
    }

    // you need to treat n as an unsigned value
    static int hammingWeight(int n) {

        int bitCount = 0;
        while (n != 0) {
            n = n & (n - 1);
            bitCount++;
        }

        return bitCount;
    }
}
