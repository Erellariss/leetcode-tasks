package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _75_SortColorsTest {

    private final _75_SortColors testee = new _75_SortColors();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int[] expected, int[] ints) {
        testee.sortColors(ints);
        assertArrayEquals(expected, ints);
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(new int[]{0, 0, 1, 1, 2, 2}, new int[]{2, 0, 2, 1, 1, 0}),
                Arguments.of(new int[]{0, 1, 2}, new int[]{2, 0, 1}),
                Arguments.of(new int[]{0}, new int[]{0})
        );
    }
}