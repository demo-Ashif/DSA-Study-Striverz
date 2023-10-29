package study.BinarySearch;

/*
 * Find element in infinite sorted array
 * */

import java.util.Arrays;

public class FindElementInfiniteLoop {
    public static void main(String[] args) {
//        int[] values = new int[120];
//        for (int i = 0; i < 120; i++) {
//            values[i] = i + 1;
//        }
//
//        System.out.println(Arrays.toString(values));

//        int result = findElementInInfiniteArray(values, 99);
        int result = findElementInInfiniteArray(new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170}, 170);
        if (result == -1) {
            System.out.println("Not Found!");
        } else {
            System.out.printf("Found at index: %d", result);
        }

    }

    static int findElementInInfiniteArray(int[] arr, int target) {
        // first find the range
        // start with box size of 2. i.e.: start will be 0 , end will be 1
        int start = 0;
        int end = 1;

        while (target >= arr[end]) {
            int temp = end + 1; //new start value
            //end will be end + sizeofPrevBox*2
            end = end + ((end - start) + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, start, end, target);

    }

    static int binarySearch(int[] arr, int startIndex, int endIndex, int target) {


        int start = startIndex;
        int end = endIndex;

        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }
}
