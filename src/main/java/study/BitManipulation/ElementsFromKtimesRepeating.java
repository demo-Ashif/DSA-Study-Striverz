package study.BitManipulation;


//https://leetcode.com/problems/single-number-ii/
public class ElementsFromKtimesRepeating {
    public static void main(String[] args) {
        int[] value = new int[]{1, 2, 2, 1, 2, 5, 1, 2, 1};
        int result = singleNumberII(value);

        System.out.println(result);
    }

    private static int singleNumberII(int[] nums) {
        int ans = 0;
        int repeatCount = 4;

        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] >> i & 1) == 1) {
                    sum++;
                }
            }
            sum %= repeatCount;

            if (sum != 0) { //then set the bit
                ans |= sum << i; // conventional way of setting the bit
            }
        }
        return ans;
    }
}
