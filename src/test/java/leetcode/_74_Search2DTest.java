package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class _74_Search2DTest {

    private final _74_Search2D testee = new _74_Search2D();

    @ParameterizedTest
    @MethodSource("vals")
    void name(boolean expected, int[][] matrix, int target) {
        assertEquals(expected, testee.searchMatrix(matrix, target));
    }

    private static Stream<Arguments> vals() {
        return Stream.of(
            Arguments.of(true, new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } }, 3),
            Arguments.of(false, new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } }, 13)
        );
    }
}