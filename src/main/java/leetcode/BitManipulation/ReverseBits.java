package leetcode.BitManipulation;

/*
 * https://leetcode.com/problems/reverse-bits/
 */
public class ReverseBits {
    public static void main(String[] args) {
        int result = reverseBits(2);
        System.out.print(result);
    }

    // you need to treat n as an unsigned value
    static public int reverseBits(int n) {
        int bits = 32;
        int result = 0;
        for (int i = 0; i < bits; i++) {
            int lsb = n & 1;
            int reverseLsb = lsb << (bits - 1 - i);
            result = result | reverseLsb;
            n = n >> 1;
        }
        return result;
    }
}
