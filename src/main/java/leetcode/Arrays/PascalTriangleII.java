package leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/pascals-triangle/
 */
public class PascalTriangleII {
    public static void main(String[] args) {
//        List<Integer> result = generate(3);
        List<Integer> result = generateII(3);
        System.out.print(Arrays.toString(result.toArray()));
    }

    //Brute Force
    static public List<Integer> generate(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        if (rowIndex == 0) return triangle.get(0);

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);

            for (int j = 1; j < i; j++) {
                int element = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                curr.add(j, element);
            }
            curr.add(1);
            triangle.add(curr);
        }
        return triangle.get(rowIndex);
    }

    //Intuitive O(N) time O(N) space
    static public List<Integer> generateII(int rowIndex) {
        List<Integer> triangle = new ArrayList<>();

        if (rowIndex == 0) {
            triangle.add(0, 1);
            return triangle;
        }

        triangle.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = triangle.size() - 1; j > 0; j--) {
                int element = triangle.get(j - 1) + triangle.get(j);
                triangle.set(j, element);
            }
            triangle.add(1);
        }


        return triangle;
    }
}
