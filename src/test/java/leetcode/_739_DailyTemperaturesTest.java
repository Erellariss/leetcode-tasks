package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _739_DailyTemperaturesTest {

    private _739_DailyTemperatures testee = new _739_DailyTemperatures();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int[] expected, int[] input) {
        assertArrayEquals(expected, testee.dailyTemperatures(input));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, new int[]{73, 74, 75, 71, 69, 72, 76, 73}),
                Arguments.of(new int[]{1, 1, 1, 0}, new int[]{30, 40, 50, 60}),
                Arguments.of(new int[]{1, 1, 0}, new int[]{30, 60, 90})
        );
    }
}