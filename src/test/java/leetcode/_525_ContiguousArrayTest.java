package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _525_ContiguousArrayTest {

    private _525_ContiguousArray testee = new _525_ContiguousArray();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int expected, int[] input) {
        assertEquals(expected, testee.findMaxLength(input));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(2, new int[]{0, 1}),
                Arguments.of(2, new int[]{1, 0}),
                Arguments.of(2, new int[]{0, 1, 0}),
                Arguments.of(4, new int[]{0, 1, 0, 1}),
                Arguments.of(6, new int[]{0, 1, 1, 1, 1, 1, 0, 0, 0})
        );
    }
}