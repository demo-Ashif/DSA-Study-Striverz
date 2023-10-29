package leetcode.BinarySearch;

/*
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
 */

public class FindMinimumInRotatedArray2 {
    public static void main(String[] args) {
        int result = searchInRotatedArray(new int[]{1,1});
        System.out.println(result);

    }

    static int searchInRotatedArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int start = 0;
        int end = nums.length - 1;

        // first check array is rotated or not
        if (nums[start] < nums[end]) {
            //array is not rotated
            return nums[start];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                if (nums[mid] == nums[end]) {
                    end--;
                } else {
                    end = mid;
                }
            }

        }

        return nums[start];

    }
}
