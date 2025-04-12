package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _152_MaximumProductSubarrayTest {

    private _152_MaximumProductSubarray testee = new _152_MaximumProductSubarray();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int expected, int[] input) {
        assertEquals(expected, testee.maxProduct(input));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(6, new int[]{2, 3, -2, 4}),
                Arguments.of(0, new int[]{-2, 0, -1}),
                Arguments.of(2, new int[]{-2, -1, 0})
        );
    }
}