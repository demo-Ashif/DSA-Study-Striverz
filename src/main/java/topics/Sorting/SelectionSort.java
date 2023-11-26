package topics.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {13, 2, 7, 8, 4, 5, 6, 1};
        selectionSort(data);
    }

    private static void selectionSort(int[] nums) {

        for (int i = 0; i <= nums.length-2; i++) {
            int smallestIndex = i;

            for (int j = i+1 ; j <= nums.length-1; j++) {
                if (nums[j] < nums[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            int tmp = nums[i];
            nums[i] = nums[smallestIndex];
            nums[smallestIndex] = tmp;
        }

        System.out.println(Arrays.toString(nums));
    }
}
