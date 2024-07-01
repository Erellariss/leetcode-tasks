package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackspaceCompareTest {

    private _844_BackspaceCompare solution = new _844_BackspaceCompare();

    @Test
    void backspaceCompare() {
        assertTrue(solution.backspaceCompare("ab#c", "ad#c"));
    }

    @Test
    void backspaceCompare2() {
        assertTrue(solution.backspaceCompare("ab##", "c#d#"));
    }

    @Test
    void backspaceCompare3() {
        assertFalse(solution.backspaceCompare("a#c", "b"));
    }
}