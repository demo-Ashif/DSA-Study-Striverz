package leetcode.Strings;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/happy-number/
 */
public class CheckStringSwap {
    public static void main(String[] args) {
        boolean result = areAlmostEqual("bacn", "banc");
        System.out.print(result);
    }

    static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                list.add(i);
            }
            if (list.size() > 2) return false;
        }

        return (list.size() == 0 || list.size() == 2 &&
                s1.charAt(list.get(0)) == s2.charAt(list.get(1)) &&
                s2.charAt(list.get(0)) == s1.charAt(list.get(1)));
    }

}
