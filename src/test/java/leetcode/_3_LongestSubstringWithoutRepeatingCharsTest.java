package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _3_LongestSubstringWithoutRepeatingCharsTest {
    private _3_LongestSubstringWithoutRepeatingChars testee = new _3_LongestSubstringWithoutRepeatingChars();

    @Test
    void case1() {
        assertEquals(3, testee.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, testee.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, testee.lengthOfLongestSubstring("pwwkew"));
    }
}