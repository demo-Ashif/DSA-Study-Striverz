package topics.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortColors {
    public static void main(String[] args) {
//        List<Integer> nums = new int[]{2, 0, 2, 1, 1, 0};
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,0,2,1,1,0));
//        sortColors(nums);
        sortColorsDutchNationalFlag(nums);
    }

    static void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) count0++;
            if (nums[i] == 1) count1++;
            if (nums[i] == 2) count2++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < count0) {
                nums[i] = 0;
            } else if (i < count0 + count1) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    static void sortColorsDutchNationalFlag(ArrayList<Integer> nums) {
        int low = 0;
        int mid = 0;
        int high = nums.size() - 1;

        while (mid <= high) {
            if (nums.get(mid) == 0) {
                swap(nums,low,mid);
                mid++;
                low++;
            } else if (nums.get(mid) == 1) {
                mid++;
            } else {
                //swap with high
                swap(nums,mid,high);
                high--;
            }
        }

        System.out.println(nums);
    }

    public static void swap(List<Integer> arr,int l,int h){

        int temp= arr.get(l);
        arr.set(l, arr.get(h));
        arr.set(h, temp);

    }

}
