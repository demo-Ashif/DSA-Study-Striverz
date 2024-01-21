package topics.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        //matrix = [[1,1,1],[1,0,1],[1,1,1]]
//        int[][] arr = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] arr = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        setZeroes(arr);
    }

    public static void setZeroes(int[][] matrix) {

        boolean rowZero = false;
        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        //determine which row/column needs to be marked
        for (int r = 0; r < rowLen; r++) {
            for (int c = 0; c < colLen; c++) {
                if (matrix[r][c] == 0) {
                    matrix[0][c] = 0;
                    if (r > 0) {
                        matrix[r][0] = 0;
                    } else {
                        rowZero = true;
                    }
                }
            }
        }

        //if row or column is zero then whole matrix is zero
        //except first row, first column
        for (int r = 1; r < rowLen; r++) {
            for (int c = 1; c < colLen; c++) {
                if (matrix[r][0] == 0 || matrix[0][c] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int r = 0; r < rowLen; r++) {
                matrix[r][0] = 0;
            }
        }

        if (rowZero) {
            for (int c = 0; c < colLen; c++) {
                matrix[0][c] = 0;
            }
        }

        //printing
        for (int r = 0; r < rowLen; r++) {
            for (int c = 0; c < colLen; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
