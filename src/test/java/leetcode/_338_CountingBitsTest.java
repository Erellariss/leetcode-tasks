package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class _338_CountingBitsTest {

    private _338_CountingBits testee = new _338_CountingBits();

    @ParameterizedTest
    @MethodSource("vals")
    void case1(int input, int[] expected) {
        Assertions.assertArrayEquals(expected, testee.countBits(input));
    }

    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(2, new int[]{0,1,1}),
                Arguments.of(5, new int[]{0,1,1,2,1,2})
        );
    }
}