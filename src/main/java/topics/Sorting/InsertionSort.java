package topics.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] data = {13, 2, 7, 8, 4, 5, 6, 1};
        insertionSort(data);
    }

    private static void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
