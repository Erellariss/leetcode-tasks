package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloodFillTest {

    FloodFill testee = new FloodFill();

    @Test
    void floodFill() {
        int[][] src = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] expected = {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};
        int[][] actual = testee.floodFill(src, 1, 1, 2);
        assertTrue(assertTwoDimensionalEquals(expected, actual));
    }

    @Test
    void floodFill2() {
        int[][] src = {{0, 0, 0}, {0, 0, 0}};
        assertTrue(assertTwoDimensionalEquals(new int[][]{{0, 0, 0}, {0, 0, 0}},
                testee.floodFill(src, 0, 0, 0)));
    }

    private boolean assertTwoDimensionalEquals(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}