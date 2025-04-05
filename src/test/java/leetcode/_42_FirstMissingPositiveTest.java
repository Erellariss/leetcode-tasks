package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _42_FirstMissingPositiveTest {

    private _42_FirstMissingPositive testee = new _42_FirstMissingPositive();

    @Test
    void case1() {
        assertEquals(3, testee.firstMissingPositive(new int[]{1, 2, 0}));
    }

    @Test
    void case2() {
        assertEquals(2, testee.firstMissingPositive(new int[]{3, 4, -1, 1}));
    }

    @Test
    void case3() {
        assertEquals(1, testee.firstMissingPositive(new int[]{7, 6, 8, 9, 11, 12}));
    }
}