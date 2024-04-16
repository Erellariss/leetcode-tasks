package leetcode;

import leetcode.utils.TreeNode;

public class _543_DiameterOfBinaryTree {

    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        traverse(root);
        return diameter;
    }

    private int traverse(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = traverse(root.left);
        int right = traverse(root.right);

        diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1;
    }
}
