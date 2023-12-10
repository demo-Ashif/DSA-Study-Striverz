package topics.Arrays;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] arr = new int[]{-1, -100, 3, 99};
//        rotateArrayByOnePlace(arr);
//        rotateArrayByDPlacesLeft(arr, 3);
        rotateArrayByKPlacesRight(arr, 2);
    }

    static void rotateArrayByOnePlace(int[] arr) {
//        if(arr.length==1)

        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = temp;

        System.out.println(Arrays.toString(arr));
    }

    static void rotateArrayByDPlacesLeft(int[] arr, int D) {
        int size = arr.length;
        int rotateNumber = D % arr.length;

        reverse(arr, 0, rotateNumber);
        reverse(arr, rotateNumber + 1, size);
        reverse(arr, 0, size);

        System.out.println(Arrays.toString(arr));
    }

    static void rotateArrayByKPlacesRight(int[] arr, int k) {

        int size = arr.length;
        int rotateNumber = k % arr.length;

        reverse(arr, 0, size-1);
        reverse(arr, 0, rotateNumber-1);
        reverse(arr, rotateNumber, size-1);


        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
