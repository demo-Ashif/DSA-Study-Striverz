package leetcode.BitManipulation;


//https://leetcode.com/problems/single-number/
public class SingleNumber {
    public static void main(String[] args) {
        int[] value = new int[]{2, 3, 2, 4, 5, 3, 4, 5, 6};
        singleNumber(value);
    }

    private static void singleNumber(int[] nums) {
        /* Xor all the elements of the array into a variable sum thus all the
        elements present twice in an array will get removed as for example, 4 = “100”
        and if 4 xor 4 => “100” xor “100” thus answer will be “000”. */
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = (sum ^ nums[i]);
        }

        System.out.println(sum);
    }
}
