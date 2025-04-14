package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _54_SpiralMatrixTest {

    private _54_SpiralMatrix testee = new _54_SpiralMatrix();

    @ParameterizedTest
    @MethodSource("vals")
    void name(List<Integer> expected, int[][] input) {
        assertEquals(Arrays.toString(expected.toArray()), Arrays.toString(testee.spiralOrder(input).toArray()));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5), new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}}),
                Arguments.of(List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}})
        );
    }
}