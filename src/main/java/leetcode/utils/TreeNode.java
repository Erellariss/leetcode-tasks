package leetcode.utils;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode binarySearch(int value) {
        TreeNode result = this;
        while (result != null && result.val != value) {
            if (value < result.val) {
                result = result.left;
            }
            if (value > result.val) {
                result = result.right;
            }
        }
        return result;
    }

    public static TreeNode buildTree(int... nodes) {
        if (nodes == null || nodes.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nodes[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < nodes.length) {
            TreeNode curr = q.remove();

            curr.left = new TreeNode(nodes[i++]);
            q.add(curr.left);

            if (i < nodes.length) {
                curr.right = new TreeNode(nodes[i++]);
                q.add(curr.right);
            }
        }
        return root;
    }

    public static TreeNode buildTree(List<Integer> nodes) {
        if (nodes == null || nodes.isEmpty()) {
            return null;
        }
        TreeNode root = new TreeNode(nodes.get(0));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < nodes.size()) {
            TreeNode curr = q.remove();

            Integer left = nodes.get(i++);
            if (left != null) {
                curr.left = new TreeNode(left);
                q.add(curr.left);
            }

            if (i < nodes.size()) {
                Integer right = nodes.get(i++);
                if (right != null) {
                    curr.right = new TreeNode(right);
                    q.add(curr.right);
                }
            }
        }
        return root;
    }

    public static int[] toIntArray(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.remove();
            result.add(curr.val);
            if (curr.left != null && curr.right != null) {
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    @Override
    public String toString() {
        return String.format("TreeNode[%s]", val);
    }
}