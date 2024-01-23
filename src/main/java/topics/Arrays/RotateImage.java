package topics.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);
    }

    public static void rotate(int[][] matrix) {


        //as input will be always nxn matrix
        int n = matrix.length;

        //transpose the matrix, row --> col, col-->row
        for (int r = 0; r < n; r++) {
            for (int c = r + 1; c < n; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }

        //reversing every row
        for (int r = 0; r < n; r++) {
            reverseSuffix(matrix[r], 0);
        }


        //printing
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    static void reverseSuffix(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
