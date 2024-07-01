package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalTest {

    _57_InsertInterval solution = new _57_InsertInterval();

    @Test
    void insert() {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] expected = {{1, 5}, {6, 9}};
        testCase(intervals, newInterval, expected);
    }

    @Test
    void insert2() {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        int[][] expected = {{1, 2}, {3, 10}, {12, 16}};
        testCase(intervals, newInterval, expected);
    }

    private void testCase(int[][] intervals, int[] newInterval, int[][] expected) {
        int[][] actual = solution.insert(intervals, newInterval);
        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[i].length; j++) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }
}