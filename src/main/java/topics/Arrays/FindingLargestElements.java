package topics.Arrays;

import java.util.Arrays;

public class FindingLargestElements {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 80, 2, 2, 3, 69, 69, 69, 8, 3, 9, 11};

        int secondLarge = secondLargestElement(arr);
        int secondSmall = secondSmallestElement(arr);

        int[] result = new int[]{secondLarge,secondSmall};

        System.out.print(Arrays.toString(result));
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
}
