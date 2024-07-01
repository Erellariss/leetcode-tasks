package leetcode;

import leetcode.utils.TreeNode;

import java.util.*;

public class _102_BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int lvl = q.size();
            List<Integer> temp = new ArrayList<>(2);
            for (int i = 0; i < lvl; i++) {
                var curr = q.poll();
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
                temp.add(curr.val);
            }
            result.add(temp);
        }
        return result;
    }
}
