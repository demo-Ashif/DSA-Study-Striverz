package topics.Arrays;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes {
    public static void main(String[] args) {
        moveZeros(5,new int[]{1, 2,0,0,2,3});
    }


    public static int[] moveZeros(int n, int[] nums) {

        int zero = 0;
        int mv = 0;

        //find first zero

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero = i;
                mv = i + 1;
                break;
            }
        }

        for (int i = mv; i < nums.length; i++) {

            if (nums[zero] == 0 && nums[mv] != 0) {
                //swap
                nums[zero] = nums[mv];
                nums[mv] = 0;

                zero++;
            }

            mv++;
        }

        System.out.println(Arrays.toString(nums));

        return nums;
    }
}
