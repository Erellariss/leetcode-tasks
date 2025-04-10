package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _11_ContainerWithMostWaterTest {

    private _11_ContainerWithMostWater testee = new _11_ContainerWithMostWater();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int expected, int[] input) {
        assertEquals(expected, testee.maxArea(input));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(49, new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}),
                Arguments.of(1, new int[]{1, 1})
        );
    }
}