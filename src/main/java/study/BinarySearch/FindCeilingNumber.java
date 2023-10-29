package study.BinarySearch;

/*
 * Find ceiling number of a target number
 * */

public class FindCeilingNumber {
    public static void main(String[] args) {
        //private static final Logger logger = LogManager.getLogger(Main.class);
        int result = ceilingNumber(new int[]{5, 9, 17, 23, 25, 45, 59, 63, 71, 74, 78, 88, 99}, 44);
        if (result == -1) {
            System.out.println("Not Found!");
        } else {
            System.out.printf("closest ceiling is: %d", result);
        }

    }

    static int ceilingNumber(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (target == arr[mid]) {
                return arr[mid];
            } else if (target > arr[mid]) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return arr[low];
    }
}
