package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _402_RemoveKDigitsTest {

    private _402_RemoveKDigits testee = new _402_RemoveKDigits();

    @Test
    void removeKdigits() {
        assertEquals("1219", testee.removeKdigits("1432219", 3));
    }

    @Test
    void case2() {
        assertEquals("200", testee.removeKdigits("10200", 1));
    }

    @Test
    void case3() {
        assertEquals("0", testee.removeKdigits("10", 2));
    }
}