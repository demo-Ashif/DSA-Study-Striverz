package topics.Arrays;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int result = maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.print(result);
    }

    static int maxProfit(int[] arr) {

        int minPrice = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
        }

        return maxProfit;

    }
}
