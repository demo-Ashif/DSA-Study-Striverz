package topics.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindingLargestElements {
    public static void main(String[] args) {
//        int[] arr = new int[]{1, 3, 80, 2, 2, 3, 69, 69, 69, 8, 3, 9, 11};
        int[] arr = new int[]{1,2};

        int secondLarge = secondLargestElement(arr);
        int secondSmall = secondSmallestElement(arr);

        int[] result = new int[]{secondLarge, secondSmall};

//        System.out.print(Arrays.toString(result));
//        System.out.println(isSorted(4, arr));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(5);
        int output = removeDuplicates(arr);
        System.out.println(output);
    }

    //largest element

    static int largestElement(int[] arr) {
        int large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }

        return large;
    }

    static int secondLargestElement(int[] arr) {
        int large = arr[0];
        int secondLarge = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < large && arr[i] > secondLarge) {
                secondLarge = arr[i];
            }
        }

        return secondLarge;
    }

    static int secondSmallestElement(int[] arr) {
        int small = arr[0];
        int secondSmall = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > small && arr[i] < secondSmall) {
                secondSmall = arr[i];
            }
        }

        return secondSmall;
    }

    static int isSorted(int n, int[] arr) {
        // Write your code here.

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                return 0;
            }
        }

        return 1;
    }

    static int removeDuplicates(int[] arr) {
        // Write your code here.

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i+1;

//        System.out.println(Arrays.toString(arr));
//        return 0;

        //System.out.print(set.toString());
    }


}
