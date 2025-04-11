package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _560_SubarrayEqualsKTest {

    private _560_SubarrayEqualsK testee = new _560_SubarrayEqualsK();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int expected, int[] input, int k) {
        assertEquals(expected, testee.subarraySum(input, k));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(2, new int[]{1, 1, 1}, 2),
                Arguments.of(2, new int[]{1, 2, 3}, 3),
                Arguments.of(1, new int[]{1}, 1),
                Arguments.of(3, new int[]{0,0}, 0)
        );
    }
}