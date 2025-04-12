package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _53_MaximumSubarrayTest {

    private _53_MaximumSubarray testee = new _53_MaximumSubarray();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int expected, int[] input) {
        assertEquals(expected, testee.maxSubArray(input));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(6, new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}),
                Arguments.of(1, new int[]{1}),
                Arguments.of(23, new int[]{5, 4, -1, 7, 8})
        );
    }
}