package topics.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] result = twoSumTwoPointer(new int[]{3,2,4}, 6);
        System.out.print(Arrays.toString(result));
    }

    public static int[] twoSumMap(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }

    static int[] twoSumTwoPointer(int[] numbers, int target) {

        //considering inout array is sorted
        Arrays.sort(numbers);
        int start = 0;
        int end = numbers.length - 1;
        int[] result = new int[2];

        while (start < end) {
            int value = numbers[start] + numbers[end];
            if (value == target) {
                result[0] = start;
                result[1] = end;
                break;
            } else if (value < target) {
                start++;
            } else {
                end--;
            }
        }
        return result;
    }

}
