package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import utlis.Array2DAssert;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _48_RotateImageTest {

    private _48_RotateImage testee = new _48_RotateImage();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int[][] expected, int[][] input) {
        testee.rotate(input);
        Array2DAssert.assert2DArrayEquals(expected, input);
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}),
                Arguments.of(new int[][]{{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}}, new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}})
        );
    }
}