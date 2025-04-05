package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _392_IsSubsequenceTest {

    private final  _392_IsSubsequence testee = new _392_IsSubsequence();

    @Test
    void case1() {
        assertTrue(testee.isSubsequence("abc","ahbgdc"));
    }

    @Test
    void case2() {
        assertFalse(testee.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    void case3() {
        assertFalse(testee.isSubsequence("a", "b"));
    }

    @Test
    void case4() {
        assertFalse(testee.isSubsequence("acb", "ahbgdc"));
    }
}