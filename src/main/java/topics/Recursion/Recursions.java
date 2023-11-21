package topics.Recursion;

/*
 * https://leetcode.com/problems/plus-one/
 */
public class Recursions {
    public static void main(String[] args) {
//        printNos(50);
//        System.out.print(sumFirstN(3));
//        printNtoOne(1, 5);
        System.out.print(printFactorial(31));
    }


    public static long sumFirstN(long n) {
        // Write your code here.
        return (n * (n + 1)) / 2;
    }

    // print N to 1 without f(i-1,N)

    public static void printNtoOne(int i, int n) {
        if (i < n) {
            printNtoOne(i + 1, n);
        }

        System.out.print(i);
    }

    public static int printFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * printFactorial(n - 1);
    }

    public static int[] printNos(int x) {

        // Write Your Code Here

        int[] ans = new int[x];

        return printN(ans, x);

        //System.out.print(Arrays.toString(ans));
    }

    static int[] printN(int[] ans, int n) {

        if (n > 1) {
            printN(ans, n - 1);
        }

        ans[n - 1] = n;

        return ans;
    }

}
