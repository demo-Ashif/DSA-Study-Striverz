package topics.Formulas;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/plus-one/
 */
public class GCD {
    public static void main(String[] args) {
        int result = euclidGCD(52, 10);
        System.out.print(result);
    }

    static int euclidGCD(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a == 0) return b;
        else return a;
    }
}
