package topics.Arrays;

public class MaxSubArraySum {

    //Kadane Algorithm
    public static void main(String args[]) {
        int[] arr = { -2,-3, 4, -1,- 2, 1, 5, -3};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }


    public static long maxSubarraySum(int[] arr, int n) {
        long maxi = Integer.MIN_VALUE; // maximum sum
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > maxi)maxi = sum;
            // If sum < 0: discard the sum calculated
            if (sum < 0) sum = 0;
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        if (maxi < 0) maxi = 0;

        return maxi;
    }

}
