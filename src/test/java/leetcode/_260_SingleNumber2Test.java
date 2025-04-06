package leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _260_SingleNumber2Test {

    private _260_SingleNumber2 testee = new _260_SingleNumber2();

    @ParameterizedTest
    @MethodSource("vals")
    void test(int[] input, int[] expected) {
        assertArrayEquals(expected, testee.singleNumber(input));
    }

    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 1, 3, 2, 5}, new int[]{5, 3}),
                Arguments.of(new int[]{-1, 0}, new int[]{0, -1}),
                Arguments.of(new int[]{0, 1}, new int[]{0, 1})
        );
    }
}