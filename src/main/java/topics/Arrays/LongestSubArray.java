package topics.Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {

    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int[] arr = new int[]{1, 2, 1, 3};
//        subArray(arr);
        subArrayTwoPointer(arr, 2);
    }

    static void subArray(int[] nums) {
        int maxLen = 0;
        long sum = 0;
        long k = 3;

        Map<Long, Integer> preSumMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            long rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

//        return maxLen;

        System.out.println(maxLen);
    }

    static int subArrayTwoPointer(int[] nums, long k) {
        if (nums.length <= 1) return 1;

        int maxLen = 0;
        long sum = nums[0];
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            while (left <= right && sum > k) {
                sum = sum - nums[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < nums.length) {
                sum += nums[right];
            }
        }

        System.out.println(maxLen);

        return maxLen;

    }
}
