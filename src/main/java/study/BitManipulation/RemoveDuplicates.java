package study.BitManipulation;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] value = new int[]{2, 3, 2, 4, 5, 3, 4, 5, 6};
        //there is one number which has no duplicates in array. find that number using
        // bit manipaulation (XOR tabele --> 0^1 = 1; 1^0=1; otherwise 0)
        removeDuplicates(value);
    }

    private static void removeDuplicates(int[] arr) {
        /* Xor all the elements of the array into a variable sum thus all the
        elements present twice in an array will get removed as for example, 4 = “100”
        and if 4 xor 4 => “100” xor “100” thus answer will be “000”. */
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = (sum ^ arr[i]);
        }

        System.out.println(sum);
    }
}
