package topics.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {41 ,467, 334 ,500 ,169 ,724 ,478, 358, 962 ,464};
//        bubbleSort(data);
        bubbleSortRecursive(data, data.length - 1);

        for (int datum : data) {
            System.out.print(datum + " ");
        }
    }

    static void bubbleSortRecursive(int[] arr, int endIndex) {

        if (endIndex == 0) return;

        for (int j = 1; j <= endIndex; j++) {
            if (arr[j] < arr[j - 1]) {
                //swap
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }
        }


        bubbleSortRecursive(arr, endIndex - 1);

    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
