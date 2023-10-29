package leetcode.Arrays;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/product-of-array-except-self/
 */
public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int[] result = productExceptSelf(new int[]{-1, 1, 0, -3, 3});
        System.out.println(Arrays.toString(result));
    }

    /*
    * we can do this easily by O(nxn) but that is not optimized. and we can not use division
    * so there is another option is creating left and right array with all product value. then for every i'th value
    * take left[i-1] and right[i+1] and multiply. There is a boundary case. for nums[0] and nums[n-1] we can directly
    * give value of nums[0]= right[1] & nums[n-1] = left[n-2]*/

    static int[] productExceptSelf(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = nums[0];
        right[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i];
        }

        for (int i = 1; i < nums.length-1; i++) {
            nums[i] = (left[i - 1]) * (right[i + 1]);
        }

        //boundary case
        nums[0] = right[1];
        nums[nums.length-1]=left[nums.length-2];

        return nums;
    }
}
