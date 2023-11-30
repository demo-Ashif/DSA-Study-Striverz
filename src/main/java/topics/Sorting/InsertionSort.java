package topics.Sorting;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] data = {13, 2, 7, 8, 4, 5, 6, 1};
        insertionSort(data, 0, data.length - 1);

        for (int value : data) {
            System.out.print(value + " ");
        }
    }

    private static void insertionSort(int[] arr, int searchLength, int endIndex) {

        if (searchLength > endIndex) return;
        int j = searchLength;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        insertionSort(arr, searchLength + 1, endIndex);

    }
}
