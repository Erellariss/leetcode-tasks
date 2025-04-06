package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class _136_SingleNumberTest {
    private _136_SingleNumber testee = new _136_SingleNumber();

    @ParameterizedTest
    @MethodSource("vals")
    void case1(int[] input, int expected) {
        Assertions.assertEquals(expected, testee.singleNumber(input));
    }

    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(new int[]{2,2,1},1),
                Arguments.of(new int[]{4,1,2,1,2},4),
                Arguments.of(new int[]{1}, 1)
        );
    }

}