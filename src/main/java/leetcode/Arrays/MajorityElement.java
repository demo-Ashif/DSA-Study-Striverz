package leetcode.Arrays;

/*
 * https://leetcode.com/problems/majority-element/
 */
public class MajorityElement {
    public static void main(String[] args) {
        int result = majorityElement(new int[]{8, 9, 8, 9, 8});
        System.out.print(result);
    }


    //applying moors voting algorithm
    static int majorityElement(int[] nums) {
        int votes = 0;
        int candidate = nums[0];

        for (int num : nums) {
            if (num == candidate) {
                votes += 1;
            } else {
                votes -= 1;
                if (votes == 0) {
                    candidate = num;
                    votes += 1;
                }
            }
        }

        return candidate;
    }
}
