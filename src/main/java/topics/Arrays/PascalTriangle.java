package topics.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/pascals-triangle/
 */
public class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> result = generatePascal(5);
        System.out.print(Arrays.toString(result.toArray()));
    }

    static public List<List<Integer>> generatePascal(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) return triangle;

        // Add the first row [1] to the triangle
        triangle.add(new ArrayList<>(List.of(1)));

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1); // First element of each row is 1

            // Calculate middle elements of the row
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            row.add(1); // Last element of each row is 1
            triangle.add(row);
        }

        return triangle;
    }
}
