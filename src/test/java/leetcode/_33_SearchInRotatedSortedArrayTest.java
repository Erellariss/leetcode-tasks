package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _33_SearchInRotatedSortedArrayTest {

    private final _33_SearchInRotatedSortedArray testee = new _33_SearchInRotatedSortedArray();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int expected, int[] nums, int target) {
        assertEquals(expected, testee.search(nums, target));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(4, new int[]{4, 5, 6, 7, 0, 1, 2}, 0),
                Arguments.of(-1, new int[]{4, 5, 6, 7, 0, 1, 2}, 3),
                Arguments.of(-1, new int[]{1}, 0)
        );
    }
}