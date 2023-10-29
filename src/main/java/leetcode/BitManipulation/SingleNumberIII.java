package leetcode.BitManipulation;


//https://leetcode.com/problems/single-number-iii/
public class SingleNumberIII {
    public static void main(String[] args) {
        int[] value = new int[]{1,2,1,3,2,5}; //output should be 3,5
        int[] result = singleNumber3(value);
    }

    private static int[] singleNumber3(int[] nums) {
        int sum = 0;
        for (int j : nums) {
            // XOR will give output of A ^ B (A and B is two different number)
            sum = (sum ^ j);
        }

        // now will find right most set bit by conventional way
        int lowestBit = sum & (-sum);

        // now create a array of 2 elements so that we can
        // keep numbers in two different groups
        int[] result = new int[2];

        // traversing the array again
        for (int num : nums) {

            // one group is with set bit 1 in lowest bit
            // another group is O in lowest bit
            if ((num & lowestBit) == 0) {
                result[0] = result[0] ^ num;
            } else {
                result[1] = result[1] ^ num;
            }
        }

        return result;
    }
}
