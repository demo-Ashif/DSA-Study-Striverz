package topics.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/plus-one/
 */
public class Recursions {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 5, 3, 6, 4};
        System.out.print(Arrays.toString(revArray(arr, 0, arr.length - 1)));
    }

    public static int[] printNos(int x) {
        int[] ans = new int[x];
        return printN(ans, x);
    }

    static int[] printN(int[] ans, int n) {
        if (n > 1) {
            printN(ans, n - 1);
        }
        ans[n - 1] = ans.length - n + 1;
        return ans;
    }

    public static void printNtimes(int n) {
        // Write your code here.
        print(n);
    }

    static void print(int n) {
        if (n > 1) {
            print(n - 1);
        }
        System.out.print("Coding Ninjas ");
    }

    public static List<Long> calc(List<Long> l, int i, long res, long n) {
        res *= i;

        if (res <= n) {

            l.add(res);

            calc(l, i + 1, res, n);

        }
        return l;
    }

    public static List<Long> factorialNumbers(long n) {

        List<Long> outputList = new ArrayList<>();

        long result = 1;

        calc(outputList, 1, result, n);

        return outputList;
    }

    public static int[] revArray(int[] arr, int l, int r) {
        if (l >= r) {
            return arr;
        }

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        revArray(arr, l + 1, r - 1);
        return arr;
    }
}
