package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _46_Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        backtrack(nums, ans, new ArrayList<>(), new boolean[nums.length]);
        return ans;
    }

    private void backtrack(int[] nums, List<List<Integer>> ans, ArrayList<Integer> temp, boolean[] used) {
        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            temp.add(nums[i]);

            backtrack(nums, ans, temp, used);

            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}
