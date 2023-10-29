package leetcode.BinarySearch;

/*
 * https://leetcode.com/problems/find-in-mountain-array/
 */

import java.util.ArrayList;

public class FindInMountainArray {
    public static void main(String[] args) {
        ArrayList<Integer> mountainArr = new ArrayList<>();
        mountainArr.add(1);
        mountainArr.add(5);
        mountainArr.add(2);

        int target = 2;

        int peakElementIndex = findPeakElement(mountainArr);
        int firstResult = binarySearch(mountainArr, target, 0, peakElementIndex,true);
        if (firstResult == -1) {
            int end = mountainArr.size() - 1;
            firstResult = binarySearch(mountainArr, target, peakElementIndex, end,false);
        }
        System.out.println(firstResult);

    }

    static int findPeakElement(ArrayList<Integer> mountainArr) {
        int start = 0;
        int end = mountainArr.size() - 1;

        while (start != end) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    static int binarySearch(ArrayList<Integer> arr, int target, int startIndex, int endIndex, boolean isFirstHalf) {
        int index = -1;
        int start = startIndex;
        int end = endIndex;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target == arr.get(mid)) {
                return mid;
            }

            if (isFirstHalf) {
                if (target < arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return index;
    }
}
