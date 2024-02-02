package topics.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
//        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr = new int[][]{{1, 2}, {3,4}};
        System.out.println(spiralOrder(arr));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0) return result;

        int left = 0, top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;


        while (left <= right && top <= bottom) {

            //get every value in the top row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++; // top will be shifted down

            //get every value in the right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }

            right--; // right will be shifted left by 1 column

            //if input is single colum or single row
            if (!(left <= right && top <= bottom)) break;

            //get every value in the bottom row
            for (int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
            }
            bottom--;

            //get every value in the left column
            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }

            left++; //left will be shifted to right by 1

        }

        return result;
    }
}
