package topics.Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 4, 1, 5, 2, 6, 4};
        int high = arr.length - 1;
        mergeSort(arr, 0, high);
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low == high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        mergeArray(arr, low, mid, high);
    }

    //[1,3,5,6,8,9]  [4,7,10,11,12]
    static void mergeArray(int[] arr, int low, int mid, int high) {
        List<Integer> result = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                result.add(arr[left]);
                left++;
            } else {
                result.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            result.add(arr[left]);
            left++;
        }

        while (right <= high) {
            result.add(arr[right]);
            right++;
        }

        for (int i = low; i<=high;i++){
            arr[i] = result.get(i-low);
        }
    }
}
