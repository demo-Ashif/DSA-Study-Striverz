package leetcode.LinearSearch;
/*
 * https://leetcode.com/problems/richest-customer-wealth/
 */

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] input = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        int ans = maximumWealth(input);
        System.out.println(ans);
    }

    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int wealth = 0;
            for (int element : account) {
                wealth += element;
            }
            max = Math.max(wealth, max);

        }

        return max;
    }

}
