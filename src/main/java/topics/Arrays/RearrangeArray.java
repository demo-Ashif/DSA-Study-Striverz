package topics.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class RearrangeArray {
    public static void main(String[] args) {
        int[] result = rearrangeArrayOptimal(new int[]{3, 1, -2, -5, 2, -4});
        System.out.print(Arrays.toString(result));
    }

    static int[] rearrangeArray(int[] nums) {

        int n = nums.length;
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        int[] result = new int[n];

        for (int num : nums) {
            if (num > 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        for (int i = 0; i < n / 2; i++) {
            result[2 * i] = positive.get(i);
            result[2 * i + 1] = negative.get(i);
        }


        return result;

    }

    static int[] rearrangeArrayOptimal(int[] nums) {

        int n = nums.length;
        int positive = 0;
        int negative = 1;

        int[] result = new int[n];


        for (int i = 0; i < n; i++) {

            if (nums[i] > 0) { //positive number
                result[positive] = nums[i];
                positive += 2;
            } else {
                result[negative] = nums[i];
                negative += 2 ;
            }
        }


        return result;

    }
}
