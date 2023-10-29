package study.BitManipulation;

import java.util.Scanner;

public class ClearIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Get the number input */
        System.out.print("Enter the Number:");
        int number = sc.nextInt();
        /* Get the bit position input */
        System.out.print("Enter the Bit position you want clear(Between 0-31):");
        int bit_pos = sc.nextInt();
        findIthBit(number, bit_pos);
    }

    // Approach 2 left shift and (& with actual number)

    private static void findIthBit(int i, int k) {

        // left shift e.g 000010000 for K=5
        int mask = 1 << k;
        // invert the mask
        mask = ~mask; //now mask is 111101111
        // now if we & the i and mak, it will set ith bit
        i = i & mask;

        System.out.printf("After clear: %d", i);
    }


}
