package topics.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {13, 2, 7, 8, 4, 5, 6, 1};
        selectionSort(data);
    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i <= arr.length-2; i++) {
            int smallestIndex = i;

            for (int j = i+1 ; j <= arr.length-1; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = tmp;

            System.out.print(arr[smallestIndex]);
        }

    }
}
