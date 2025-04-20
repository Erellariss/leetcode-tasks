package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _84_LargestRectangleInHistogramTest {

    private _84_LargestRectangleInHistogram testee = new _84_LargestRectangleInHistogram();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int expected, int[] input) {
        assertEquals(expected, testee.largestRectangleArea(input));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(10, new int[]{2, 1, 5, 6, 2, 3}),
                Arguments.of(12, new int[]{3, 2, 5, 6, 2, 3}),
                Arguments.of(4, new int[]{2, 4}),
                Arguments.of(1, new int[]{1}),
                Arguments.of(9, new int[]{9, 0}),
                Arguments.of(4, new int[]{2, 3}),
                Arguments.of(4, new int[]{3, 2}),
                Arguments.of(2, new int[]{2, 0, 2}),
                Arguments.of(3, new int[]{2, 1, 2}),
                Arguments.of(4, new int[]{1, 1, 1, 1})

        );
    }
}