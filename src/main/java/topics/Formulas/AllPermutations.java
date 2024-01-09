package topics.Formulas;

import java.util.ArrayList;
import java.util.List;

public class AllPermutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ls = permute(nums);
        System.out.println("All Permutations are");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    static void recurPermute(List<List<Integer>> ans, List<Integer> ds, int[] nums) {
        //if we match the length, it is a permutation
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int num = 1; num <= nums.length; num++) {
            //avoid if there is already a number picked in ds
            if (ds.contains(num)) continue;
            //add new element
            ds.add(num);
            //go back to try other element
            recurPermute(ans, ds, nums);
            //remove the element
            ds.remove(ds.size() - 1);
        }
    }


    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        recurPermute(ans, ds, nums);
        return ans;
    }
}
