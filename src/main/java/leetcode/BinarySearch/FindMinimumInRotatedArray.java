package leetcode.BinarySearch;

/*
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */

public class FindMinimumInRotatedArray {
    public static void main(String[] args) {
        int result = searchInRotatedArray(new int[]{3,1,2});
        System.out.println(result);

    }

    static int searchInRotatedArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int start = 0;
        int end = nums.length - 1;

        // first check array is rotated or not
        if (nums[start] < nums[end]) {
            //array is not rotated
            return nums[start];
        }

        //no characteristic
        //All the elements to the left of inflection point > first element of the array.
        //All the elements to the right of inflection point < first element of the array.

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if the mid element is greater than its next element then mid+1 element is the
            // smallest
            // This point would be the point of change. From higher to lower value.
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            // if the mid element is lesser than its previous element then mid element is
            // the smallest
            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }

            // if the mid elements value is greater than the 0th element this means
            // the least value is still somewhere to the right as we are still dealing with
            // elements
            // greater than nums[start]
            if (nums[mid] > nums[start]) {
                start = mid + 1;
            } else {
                // if nums[start] is greater than the mid value then this means the smallest value
                // is somewhere to
                // the left
                end = mid - 1;
            }

        }

        return  -1;

    }

    // another approach

    static int searchInRotatedArrayApproach2(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // if the mid elements value is greater than the end element this means
            // the least value is still somewhere to the right as we are still dealing with
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                // if mid element is less than the end element this means the smallest value
                // is somewhere to the left
                end = mid;
            }

        }

        // at last nums[start] always point to the
        // smallest element in the array which is the minimum value also the rotation count
        return  nums[start];

    }
}
