package topics.Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {

    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int[] arr = new int[]{2, 0, 0, 3};
        subArray(arr);
    }

    static void subArray(int[] nums) {
        int maxLen = 0;
        int k = 3;
        long sum = 0;

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


        System.out.println(maxLen);
    }
}
