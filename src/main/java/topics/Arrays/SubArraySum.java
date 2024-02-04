package topics.Arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2, 3,-3,1,1,1,4,2,-1};
        System.out.println(subarraySum(arr, 3));
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 1); //prefixsum, count

        int prefixSum = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            int remove = prefixSum - k;

            // Add the number of subarrays to be removed:
            count += map.getOrDefault(remove, 0);

            // Update the count of prefix sum
            // in the map.
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
