package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _78_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, ans, new ArrayList<>(), 0);
        return ans;
    }

    private void backtrack(int[] nums, List<List<Integer>> ans, List<Integer> path, int start) {
        ans.add(new ArrayList<>(path));
        for (int i = start; i < nums.length ; i++) {
            path.add(nums[i]);
            backtrack(nums, ans, path, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
