package topics.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {13, 2, 7, 8, 4, 5, 6, 1};
        selectionSort(data,0,data.length-1);

        for (int value : data) {
            System.out.print(value + " ");
        }
    }

    private static void selectionSort(int[] arr, int smallestIndex, int endIndex) {

        if (smallestIndex == endIndex) return;

        for (int j = smallestIndex + 1; j <= endIndex; j++) {
            if (arr[j] < arr[smallestIndex]) {
                int tmp = arr[j];
                arr[j]=arr[smallestIndex];
                arr[smallestIndex] = tmp;
            }
        }

        selectionSort(arr,smallestIndex+1,endIndex);

    }
}
