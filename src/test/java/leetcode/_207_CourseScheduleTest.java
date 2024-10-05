package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _207_CourseScheduleTest {

    private _207_CourseSchedule testee = new _207_CourseSchedule();

    @Test
    void case1() {
        assertTrue(testee.canFinish(2, new int[][]{{1, 0}}));
    }

    @Test
    void case2() {
        assertFalse(testee.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }
}