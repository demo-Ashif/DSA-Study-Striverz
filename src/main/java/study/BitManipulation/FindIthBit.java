package study.BitManipulation;

import java.util.Scanner;

public class FindIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Get the number input */
        System.out.print("Enter the Number:");
        int number = sc.nextInt();
        /* Get the bit position input */
        System.out.print("Enter the Bit position you want to get(Between 0-31):");
        int bit_pos = sc.nextInt();
        findIthBit(number, bit_pos);
    }

    // Approach 2 left shift and (& with actual number)

    private static void findIthBit(int i, int k) {

        int mask = 1 << k;
        if ((mask & i) == 1) {
            System.out.println("iTH bit is 1");
        } else {
            System.out.println("iTH bit is 0");
        }
    }


}
