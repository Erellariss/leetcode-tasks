package leetcode;

import java.util.ArrayList;
import java.util.List;

import leetcode.utils.TreeNode;

public class _199_RightSideVIew {
    public List<Integer> rightSideView(TreeNode root) {
        var ans = new ArrayList<Integer>();
        dfs(0, root, ans);
        return ans;
    }

    private void dfs(int currentLevel, TreeNode root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }
        if (currentLevel >= ans.size()) {
            ans.add(root.val);
        }
        dfs(currentLevel + 1, root.right, ans);
        dfs(currentLevel + 1, root.left, ans);
    }
}
