package leetcode;

import leetcode.utils.ListNode;
import leetcode.utils.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _109_ConvertSortedListToBSTTest {

    private final _109_ConvertSortedListToBST testee = new _109_ConvertSortedListToBST();

    @ParameterizedTest
    @MethodSource("vals")
    void name(TreeNode expected, ListNode head) {
        assertEquals(expected, testee.sortedListToBST(head));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(new TreeNode(0, new TreeNode(-3, new TreeNode(-10), null), new TreeNode(9, new TreeNode(5), null)), ListNode.of(-10, -3, 0, 5, 9)),
                Arguments.of(null, null)
        );
    }
}