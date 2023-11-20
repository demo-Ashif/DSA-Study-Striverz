package topics.Recursion;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/plus-one/
 */
public class Recursions {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(printNos(5)));
//        printNtimes(5);
    }

    public static  int[] printNos(int x) {
        int[] ans = new int[x];
        return printN(ans, x);
    }

    static int[] printN(int[] ans, int n) {
        if (n > 1) {
            printN(ans, n - 1);
        }
        ans[n - 1] = ans.length-n+1;
        return ans;
    }

    public static void printNtimes(int n){
        // Write your code here.
        print(n);
    }

    static void print(int n){
        if(n>1){
            print(n-1);
        }
        System.out.print("Coding Ninjas ");
    }
}
