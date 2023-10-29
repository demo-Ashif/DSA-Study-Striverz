package leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/pascals-triangle/
 */
public class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> result = generate(5);
        System.out.print(Arrays.toString(result.toArray()));
    }

    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) return triangle;
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);

            for (int j = 1; j < i; j++) {
                //measuring how elements need to be inserted as per pascal triangle
                // and inserting those value by adding them from i-1 list
                int element = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                curr.add(j, element);
            }
            curr.add(1);
            triangle.add(curr);
        }


        return triangle;
    }
}
