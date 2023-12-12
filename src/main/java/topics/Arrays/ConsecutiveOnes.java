package topics.Arrays;

/*
 * https://leetcode.com/problems/plus-one/
 */
public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 1, 0, 1, 1, 1};

        int result = findMaxConsecutiveOnes(arr1);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(count, max);
            } else {
                count = 0;
            }
        }

        System.out.println(max);

        return max;
    }
}
