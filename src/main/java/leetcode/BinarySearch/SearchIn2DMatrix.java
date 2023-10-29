package leetcode.BinarySearch;

import java.util.Arrays;

//https://leetcode.com/problems/search-a-2d-matrix/

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5, 7},
                {10, 12, 13, 15},
                {17, 21, 33, 35},
                {39, 41, 48, 55}
        };
        int target = 33;
        boolean ans = searchOnlyBinary(arr, target); // format of return value {row, col}

        System.out.println(ans);
    }

    //binary search O(log(NxM))
    static boolean searchOnlyBinary(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length * matrix[0].length - 1;
        int columnLen = matrix[0].length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int value = matrix[(mid / columnLen)][(mid % columnLen)];

            if (target == value) {
//                return new int[]{(mid / columnLen), (mid % columnLen)};
                return true;
            } else if (target > value) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }


}
