package leetcode._402;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void removeKdigits() {
        assertEquals("1219", solution.removeKdigits("1432219", 3));
    }

    @Test
    void case2() {
        assertEquals("200", solution.removeKdigits("10200", 1));
    }

    @Test
    void case3() {
        assertEquals("0", solution.removeKdigits("10", 2));
    }
}