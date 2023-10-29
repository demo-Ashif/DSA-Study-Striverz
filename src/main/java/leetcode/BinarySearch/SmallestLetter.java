package leetcode.BinarySearch;

/*
 * /*
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */


public class SmallestLetter {
    public static void main(String[] args) {
        char result = nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c');
        System.out.println(result);

    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // it will return value of index or return first index (0) if no condition is met
        return letters[start % letters.length];
    }
}
