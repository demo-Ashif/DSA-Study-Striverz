package leetcode.BinarySearch;

/*
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int result = peakIndexInMountainArray(new int[]{1, 2, 3, 4, 6, 7, 5, 3, 2});
        System.out.println(result);

    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start != end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid+1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}
