package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _239_SlidingWindowMaximumTest {

    private _239_SlidingWindowMaximum testee = new _239_SlidingWindowMaximum();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int[] expected, int[] input, int k) {
        assertArrayEquals(expected, testee.maxSlidingWindow(input, k));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(new int[]{3, 3, 5, 5, 6, 7}, new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3),
                Arguments.of(new int[]{1}, new int[]{1}, 1)
        );
    }
}