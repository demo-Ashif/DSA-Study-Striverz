package topics.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] data = {4, 6, 2, 5, 7, 9, 1, 3};
        quickSort(data, 0, data.length - 1);
//        int partitionIndex = makePartition(data, 0);

        for (int datum : data) {
            System.out.print(datum + " ");
        }

//        System.out.println(partitionIndex);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low > high) return;

        int partition = makePartition(arr, low, high);
        quickSort(arr, low, partition - 1);
        quickSort(arr, partition + 1, high);
    }

    static int makePartition(int[] arr, int low, int high) {


        int pivotIndex = low;

        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= arr[pivotIndex] && i <= high) {
                i++;
            }
            while (arr[j] > arr[pivotIndex] && j >= low) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[j];
        arr[j] = arr[pivotIndex];
        arr[low] = temp;

        return j;

    }

}
