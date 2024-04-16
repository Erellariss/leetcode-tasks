package leetcode;

import leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {

    private InvertBinaryTree testee = new InvertBinaryTree();


    @Test
    void invertTree1() {
        TreeNode actual = testee.invertTree(TreeNode.buildTree(new int[]{
                4, 2, 7, 1, 3, 6, 9
        }));
        assertArrayEquals(new int[]{4, 7, 2, 9, 6, 3, 1}, TreeNode.toIntArray(actual));
    }

    @Test
    void invertTree2() {
        TreeNode actual = testee.invertTree(TreeNode.buildTree(new int[]{
                2, 1, 3
        }));
        assertArrayEquals(new int[]{2, 3, 1}, TreeNode.toIntArray(actual));
    }
    @Test
    void invertTree3() {
        TreeNode actual = testee.invertTree(TreeNode.buildTree(new int[]{}));
        assertArrayEquals(null, TreeNode.toIntArray(actual));
    }
}