package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _283_MoveZeroesTest {

    private _283_MoveZeroes testee = new _283_MoveZeroes();

    @Test
    void case1() {
        int[] arg = {0, 1, 0, 3, 12};
        testee.moveZeroes(arg);
        assertArrayEquals(new int[]{1,3,12,0,0}, arg);
    }

    @Test
    void case2() {
        int[] arg = {0};
        testee.moveZeroes(arg);
        assertArrayEquals(new int[]{0}, arg);

    }
}