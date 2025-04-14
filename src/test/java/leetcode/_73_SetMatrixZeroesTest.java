package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import utlis.Array2DAssert;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _73_SetMatrixZeroesTest {

    private _73_SetMatrixZeroes testee = new _73_SetMatrixZeroes();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int[][] expected, int[][] input) {
        testee.setZeroes(input);
        Array2DAssert.assert2DArrayEquals(expected, input);
    }

    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}, new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}),
                Arguments.of(new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}}, new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}}),
                Arguments.of(new int[][]{{0, 0, 0}}, new int[][]{{1, 0, 3}})
        );
    }
}