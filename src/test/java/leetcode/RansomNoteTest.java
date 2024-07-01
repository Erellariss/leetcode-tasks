package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    _383_RansomNote solution = new _383_RansomNote();

    @Test
    void canConstruct() {
        assertFalse(solution.canConstruct("a", "b"));
    }
    @Test
    void canConstruct2() {
        assertFalse(solution.canConstruct("aa", "ab"));
    }

    @Test
    void name() {
        assertTrue(solution.canConstruct("aa", "aab"));
    }
}