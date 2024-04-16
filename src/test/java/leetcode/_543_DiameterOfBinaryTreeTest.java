package leetcode;

import leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class _543_DiameterOfBinaryTreeTest {

    private _543_DiameterOfBinaryTree solution = new _543_DiameterOfBinaryTree();

    @Test
    void name() {
        assertEquals(3, solution.diameterOfBinaryTree(TreeNode.buildTree(1, 2, 3, 4, 5)));
    }

    @Test
    void name2() {
        assertEquals(1, solution.diameterOfBinaryTree(TreeNode.buildTree(1, 2)));
    }

    @Test
    void name2_2() {
        assertEquals(2, solution.diameterOfBinaryTree(TreeNode.buildTree(1, 2, 3)));
    }

    @Test
    void name3() {
        assertEquals(8, solution.diameterOfBinaryTree(TreeNode.buildTree(
                asList(4, -7, -3, null, null, -9, -3, 9, -7, -4, null, 6, null, -6, -6, null, null, 0, 6, 5, null, 9, null, null, -1, -4, null, null, null, -2))));
    }
}