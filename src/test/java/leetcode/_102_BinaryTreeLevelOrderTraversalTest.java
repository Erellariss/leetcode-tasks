package leetcode;

import leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.*;

class _102_BinaryTreeLevelOrderTraversalTest {
    private _102_BinaryTreeLevelOrderTraversal testee = new _102_BinaryTreeLevelOrderTraversal();

    @Test
    void tesCase() {
        assertEquals(of(of(3), of(9, 20), of(15, 7)), testee.levelOrder(TreeNode.buildTree(asList(3, 9, 20, null, null, 15, 7))));
    }

    @Test
    void tesCase2() {
        assertEquals(of(of(1)), testee.levelOrder(TreeNode.buildTree(1)));
    }

    @Test
    void tesCase3() {
        assertEquals(of(), testee.levelOrder(TreeNode.buildTree()));
    }

    @Test
    void tesCase4() {
        assertEquals(of(of(1), of(2, 3), of(4, 5)), testee.levelOrder(TreeNode.buildTree(asList(1, 2, 3, 4, null, null, 5))));
    }
    @Test
    void tesCase5() {
        assertEquals(of(of(1),  of(2), of(3), of(4), of(5)), testee.levelOrder(TreeNode.buildTree(asList(1,2,null,3,null,4,null,5))));
    }
}