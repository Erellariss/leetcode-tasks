package leetcode;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import leetcode.utils.TreeNode;

class _199_RightSideVIewTest {

    private final _199_RightSideVIew testee = new _199_RightSideVIew();

    @ParameterizedTest
    @MethodSource("vals")
    void name(List<Integer> expected, TreeNode root) {
        assertIterableEquals(expected, testee.rightSideView(root));
    }

    private static Stream<Arguments> vals() {
        return Stream.of(
            Arguments.of(List.of(1, 3, 4), TreeNode.buildTree(1, 2, 3, null, 5, null, 4)),
            Arguments.of(List.of(1, 3, 4, 5), TreeNode.buildTree(1, 2, 3, 4, null, null, null, 5)),
            Arguments.of(List.of(1, 3), TreeNode.buildTree(1, null, 3))
        );
    }
}