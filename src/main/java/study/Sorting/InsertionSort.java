package study.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] data = {13, 2, 7, 8, 4, 5, 6, 1};
        insertionSort(data);
    }

    private static void insertionSort(int[] nums) {

        // 13, 2, 7, 8, 4, 5, 6, 1
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int j = i-1;
            while (j>=0 && current < nums[j]){
                nums[j+1]= nums[j];
                j--;
            }

            //placement
            nums[j+1] = current;
        }

        System.out.println(Arrays.toString(nums));
    }
}
