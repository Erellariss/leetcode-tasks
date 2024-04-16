package leetcode;

import leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;

class LowestCommonAncestorTest {

    private LowestCommonAncestor testee = new LowestCommonAncestor();

    @Test
    void lowestCommonAncestor1() {
        testCase(asList(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5), 2, 8, 6);
    }

    @Test
    void lca2() {
        testCase(asList(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5), 2, 4, 2);
    }

    @Test
    void lca3() {
        testCase(asList(2, 1), 2, 1, 2);
    }

    private void testCase(List<Integer> tree, int p, int q, int expectedResult) {
        TreeNode root = TreeNode.buildTree(tree);
        TreeNode pTree = root.binarySearch(p);
        TreeNode qTree = root.binarySearch(q);
        TreeNode expected = root.binarySearch(expectedResult);
        Assertions.assertEquals(expected, testee.lowestCommonAncestor(root, pTree, qTree));
    }
}