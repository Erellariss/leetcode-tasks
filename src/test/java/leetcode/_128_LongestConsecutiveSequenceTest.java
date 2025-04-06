package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _128_LongestConsecutiveSequenceTest {

    private _128_LongestConsecutiveSequence testee = new _128_LongestConsecutiveSequence();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int expected, int[] input) {
        assertEquals(expected, testee.longestConsecutive(input));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(4, new int[]{100, 4, 200, 1, 3, 2}),
                Arguments.of(9, new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}),
                Arguments.of(3, new int[]{1, 0, 1, 2})
        );
    }
}