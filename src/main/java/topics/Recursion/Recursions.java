package topics.Recursion;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/plus-one/
 */
public class Recursions {
    public static void main(String[] args) {
        printNos(50);
    }

    public static void printNos(int x) {

        // Write Your Code Here

        int[] ans = new int[x];

        printN(ans, x);

        System.out.print(Arrays.toString(ans));
    }

    static void printN(int[] ans, int n) {

        if (n > 1) {
            printN(ans, n - 1);
        }

        ans[n - 1] = n;
    }

}
