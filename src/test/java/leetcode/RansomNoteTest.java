package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    RansomNote solution = new RansomNote();

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