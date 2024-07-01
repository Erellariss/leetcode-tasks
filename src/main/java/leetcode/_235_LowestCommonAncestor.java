package leetcode;

import leetcode.utils.TreeNode;

public class _235_LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode result = root;
        TreeNode pCandidate = nextStep(result, p);
        TreeNode qCandidate = nextStep(result, q);

        while (pCandidate == qCandidate) {
            result = pCandidate;
            pCandidate = nextStep(result, p);
            qCandidate = nextStep(result, q);
        }

        return result;
    }

    private TreeNode nextStep(TreeNode root, TreeNode direction) {
        if (root.val == direction.val) {
            return root;
        } else if (direction.val < root.val) {
            return root.left;
        } else {
            return root.right;
        }
    }
}
