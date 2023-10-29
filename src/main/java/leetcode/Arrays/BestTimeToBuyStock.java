package leetcode.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int result = maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.print(result);
    }

    static int maxProfit(int[] prices) {

        int minValueSoFar = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            minValueSoFar = Math.min(minValueSoFar, prices[i]);
            int tmpProfit = prices[i] - minValueSoFar;
            profit = Math.max(profit, tmpProfit);
        }

        return profit;

    }
}
