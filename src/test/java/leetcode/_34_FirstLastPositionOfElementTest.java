package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _34_FirstLastPositionOfElementTest {

    private final _34_FirstLastPositionOfElement testee = new _34_FirstLastPositionOfElement();
    private final _34_FirstLastPositionOfElement_FirstLast testee2 = new _34_FirstLastPositionOfElement_FirstLast();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int[] expected, int[] nums, int target) {
        assertArrayEquals(expected, testee.searchRange(nums, target));
    }

    @ParameterizedTest
    @MethodSource("vals")
    void name2(int[] expected, int[] nums, int target) {
        assertArrayEquals(expected, testee2.searchRange(nums, target));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(new int[]{3, 4}, new int[]{5, 7, 7, 8, 8, 10}, 8),
                Arguments.of(new int[]{-1, -1}, new int[]{5, 7, 7, 8, 8, 10}, 6),
                Arguments.of(new int[]{-1, -1}, new int[]{}, 0)

        );
    }
}