package topics.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/plus-one/
 */
public class FindUnion {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 6};
        int[] arr2 = new int[]{2, 3, 5};

        sortedArray(arr1, arr2);
    }

    public static List<Integer> sortedArray(int[] a, int[] b) {
        // Write your code here
        List<Integer> union = new ArrayList<>();


        int n1 = a.length;
        int n2 = b.length;
        int i = 0;
        int j = 0;

        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != a[i]) {
                    union.add(a[i]);
                }
                i++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != b[j]) {
                    union.add(b[j]);
                }
                j++;
            }


            while (i < n1) {
                if (union.isEmpty() || union.get(union.size() - 1) != a[i]) {
                    union.add(a[i]);
                }
                i++;
            }

            while (j < n2) {
                if (union.isEmpty() || union.get(union.size() - 1) != b[j]) {
                    union.add(b[j]);
                }
                j++;
            }
        }

        System.out.println(union.toString());

        return union;
    }
}
