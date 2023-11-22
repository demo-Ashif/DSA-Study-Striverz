package topics.Hashing;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/plus-one/
 */
public class Hashing {
    public static void main(String[] args) {
        intHashing(new int[]{1, 3, 4, 3, 4, 5, 6, 6, 7, 12});
//        System.out.print(Arrays.toString(result));
    }

    static void intHashing(int[] nums) {
        int[] hash = new int[13];

        //pre compute
        for (int i = 0; i < nums.length; i++) {
            int hashIndex = nums[i];
            hash[hashIndex] += 1;
        }

        //fetch
        for (int i = 0; i < nums.length; i++) {
            int hashIndex = nums[i];
            System.out.println(hash[hashIndex]);
        }
    }
}
