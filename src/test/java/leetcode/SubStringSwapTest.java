package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubStringSwapTest {

    @Test
    void swapEven() {
        assertCase("abcdef", 3, "defabc");
    }

    @Test
    void swapOdd() {
        assertCase("abc", 1, "cab");
    }

    @Test
    void swapOdd2() {
        assertCase("12345", 1, "51234");
    }

    @Test
    void swapWrongArgs() {
        assertCase("", 0, "");
        assertCase("123", 0, "123");
        assertCase("123", 3, "123");
        assertCase("123", -1, "123");
        assertCase("123", 4, "123");
        assertCase((char[]) null, 1, null);
    }

    private static void assertCase(String src, int indexExcl, String expected) {
        Assertions.assertEquals(expected, new String(SubStringSwap.swapSubstring(src.toCharArray(), indexExcl)));
    }

    private static void assertCase(char[] src, int indexExcl, char[] expected) {
        Assertions.assertArrayEquals(expected, SubStringSwap.swapSubstring(src, indexExcl));
    }
}