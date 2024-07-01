package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _542_01_MatrixTest {

    private _542_01_Matrix testee = new _542_01_Matrix();

    @Test
    void updateMatrix() {
        int[][] input = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] expected = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};

        assertArrayEquals(expected, testee.updateMatrix(input));
    }

    @Test
    void updateMatrix2() {
        int[][] input = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] expected = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 2, 1}};

        assertArrayEquals(expected, testee.updateMatrix(input));
    }

    @Test
    void updateMatrix3() {

        int[][] input = new int[][]{{0,1,0,1,1},{1,1,0,0,1},{0,0,0,1,0},{1,0,1,1,1},{1,0,0,0,1}};
        int[][] expected = new int[][]{{0,1,0,1,2},{1,1,0,0,1},{0,0,0,1,0},{1,0,1,1,1},{1,0,0,0,1}};

        assertArrayEquals(expected, testee.updateMatrix(input));
    }
}