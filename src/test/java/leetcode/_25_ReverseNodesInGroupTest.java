package leetcode;

import leetcode.utils.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _25_ReverseNodesInGroupTest {

    private _25_ReverseNodesInGroup testee = new _25_ReverseNodesInGroup();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int[] expected, ListNode head, int k) {
        assertArrayEquals(expected, testee.reverseKGroup(head, k).toArray());
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 4, 3, 5}, ListNode.of(1, 2, 3, 4, 5), 2),
                Arguments.of(new int[]{3, 2, 1, 4, 5}, ListNode.of(1, 2, 3, 4, 5), 3),
                Arguments.of(new int[]{2, 1, 3}, ListNode.of(1, 2, 3), 2),
                Arguments.of(new int[]{2, 1}, ListNode.of(1, 2), 2),
                Arguments.of(new int[]{2}, ListNode.of(2), 1)

        );
    }
}