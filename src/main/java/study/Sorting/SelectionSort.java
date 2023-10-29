package study.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {13, 2, 7, 8, 4, 5, 6, 1};
        selectionSort(data);
    }

    private static void selectionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int smallest = i;

            //checking remaining array which index has the smallest value
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    smallest = j;
                }
            }

            //swap
            int tmp = nums[i];
            nums[i] = nums[smallest];
            nums[smallest] = tmp;
        }

        System.out.println(Arrays.toString(nums));
    }
}
