package leetcode.BinarySearch;

/*
 * https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
 */

public class SearchInRotatedArray2 {
    public static void main(String[] args) {
        boolean result = searchInRotatedArray(new int[]{1, 0, 1, 1, 1}, 0);
        System.out.println(result);

    }

    static boolean searchInRotatedArray(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return true;
            }

            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                // this is the only tricky edge case becasue duplicate values are allowed. and in this case
                // we can not know where to apply binary search. so just we are skipping duplicate values from
                // start and end. on avg time complexity is O(lognN) but only for this case it will be O(n)
                start++;
                end--;
            } else if (nums[start] <= nums[mid]) { //Left side sorted otherwise right side sorted

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

        return false;
    }

}
