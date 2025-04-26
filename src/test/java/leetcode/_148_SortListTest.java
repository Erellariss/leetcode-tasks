package leetcode;

import leetcode.utils.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _148_SortListTest {

    private final _148_SortList testee = new _148_SortList();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int[] expected, int[] input) {
        assertArrayEquals(expected, testee.sortList(ListNode.of(input)).toArray());
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{4, 2, 1, 3}),
                Arguments.of(new int[]{-1, 0, 3, 4, 5}, new int[]{-1, 5, 3, 4, 0})
        );
    }
}