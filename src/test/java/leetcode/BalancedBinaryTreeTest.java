package leetcode;

import leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

class BalancedBinaryTreeTest {

    private BalancedBinaryTree solution = new BalancedBinaryTree();

    @Test
    void isBalanced() {
        testCase(asList(3, 9, 20, null, null, 15, 7), true);
    }

    @Test
    void case2() {
        testCase(asList(1, 2, 2, 3, 3, null, null, 4, 4), false);
    }

    @Test
    void case3() {
        testCase(null, true);
    }

    @Test
    void case4() {
        testCase(asList(1,null,2,null,3), false);
    }

    private void testCase(List<Integer> list, boolean expected) {
        Assertions.assertEquals(expected, solution.isBalanced(TreeNode.buildTree(list)));
    }
}