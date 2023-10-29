package leetcode.Arrays;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class BestTimeToBuyStockII {
    public static void main(String[] args) {
        int result = maxProfit(new int[]{1, 2, 3, 4, 5});
        System.out.print(result);
    }

    static int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                //check on everyday
                profit += (prices[i] - prices[i - 1]);

            }
        }

        return profit;

    }
}
