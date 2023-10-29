package leetcode.BinarySearch;

/*
 * https://leetcode.com/problems/find-peak-element/
 */

public class FindPeakElement {
    public static void main(String[] args) {
        int result = peakIndexInMountainArray(new int[]{1, 2, 3, 4, 6, 7, 5, 3, 2});
        System.out.println(result);

    }

    static int peakIndexInMountainArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start != end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;

            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
