package study.BinarySearch;

/*
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */

public class SearchInRotatedArrayAltApproach {
    public static void main(String[] args) {
        int result = searchInRotatedArray(new int[]{8,10,12,15,2}, 2);
        System.out.println(result);
    }

    static int searchInRotatedArray(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            }

            if (nums[start] <= nums[mid]) { //Left side sorted otherwise right side sorted

                if (target >= nums[start] && target < nums[mid]) { //lies in this left side range
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // right side sorted
                if (target > nums[mid] && target <= nums[end]) { //lies in this right side range
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }
}
