package study.BitManipulation;

import java.util.Scanner;

public class FindNumberByBitsToChangeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Get the number input */
        System.out.print("Enter the 1st Number:");
        int number1 = sc.nextInt();
        /* Get the number input */
        System.out.print("Enter the 2nd Number:");
        int number2 = sc.nextInt();

        findNumberOfBits(number1, number2);

    }

    private static void findNumberOfBits(int number1, int number2) {
        // First: finding a number with different bits. So using XOR operators
        int mask = number1 ^ number2;

        // now we have to count number of set bits(1)
        // easy way to count this is n & (n-1) until number is 0
        int bitCount = 0;
        while (mask > 0) {
            mask = mask & (mask - 1);
            bitCount++;
        }
        System.out.println(bitCount);

    }


}
