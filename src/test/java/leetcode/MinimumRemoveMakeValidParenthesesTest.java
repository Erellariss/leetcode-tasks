package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumRemoveMakeValidParenthesesTest {

    private MinimumRemoveMakeValidParentheses solution = new MinimumRemoveMakeValidParentheses();

    @Test
    void t1() {
        Assertions.assertEquals("ab(c)d", solution.minRemoveToMakeValid("ab(c)d"));
    }

    @Test
    void name() {
        Assertions.assertEquals("", solution.minRemoveToMakeValid("))(("));
    }

    @Test
    void name2() {
        Assertions.assertEquals("", solution.minRemoveToMakeValid("(("));
    }

    @Test
    void minRemoveToMakeValid() {
        Assertions.assertEquals("lee(t(c)o)de", solution.minRemoveToMakeValid("lee(t(c)o)de)"));
    }
}