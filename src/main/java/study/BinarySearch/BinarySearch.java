package study.BinarySearch;

/*
* Time Complexity of Binary Search O(logN)
* pre-condition - array list must be sorted
* 1st iteration N/2, 2nd iteration N/4 .... N/2^k
* N/2^k =1
* N = 2^k
* log2^N = k ---> O(logN)
* */

public class BinarySearch {
    public static void main(String[] args) {
        int result = binarySearch(new int[]{5, 9, 17, 23, 25, 45, 59, 63, 71, 74, 78, 88, 99}, 99);
        if(result==-1){
           System.out.println("Not Found!");
        }else {
            System.out.printf("Found at index: %d",result);
        }

    }

    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
