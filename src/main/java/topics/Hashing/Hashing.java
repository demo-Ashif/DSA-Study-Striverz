package topics.Hashing;

import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/plus-one/
 */
public class Hashing {
    public static void main(String[] args) {
//        intHashing(new int[]{1, 3, 4, 3, 4, 5, 6, 6, 7, 12});
//        System.out.print(Arrays.toString(result));
        mapHashing(new int[]{1, 3, 5, 5, 6, 7, 1, 2, 2, 2, 9, 0});
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

    //lowercase letters
    static void characterHashing(String str) {
        int[] hashArray = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int hashIndex = str.charAt(i) - 'a';
            hashArray[hashIndex] += 1;
        }

        for (int i = 0; i < str.length(); i++) {
            int hashIndex = str.charAt(i) - 'a';
            System.out.print(hashArray[hashIndex]);
        }

//        System.out.println(Arrays.toString(hashArray));
    }

    static void mapHashing(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);

            } else {
                map.put(nums[i], 1);
            }
        }

        System.out.print(map);
    }
}
