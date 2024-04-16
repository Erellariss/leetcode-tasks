package leetcode;

import leetcode.utils.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        invertSubTree(root);
        return root;
    }

    private void invertSubTree(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
    }
}
