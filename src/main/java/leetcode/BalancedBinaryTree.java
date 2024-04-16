package leetcode;

import leetcode.utils.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return getBalancedDepth(root) >= 0;
    }

    private int getBalancedDepth(TreeNode root) {
//        System.out.println("Enter node: " + root);
        if (root == null) {
            return 0;
        }
        int left = getBalancedDepth(root.left);
        int right = getBalancedDepth(root.right);

        if (left == -1 || right == -1
                || Math.abs(left - right) > 1) {
//            System.out.println("Node is unbalanced: " + root);
            return -1;
        }
//        System.out.println("Exiting from recursion for node: " + root);
        return Math.max(left, right) + 1;
    }
}
