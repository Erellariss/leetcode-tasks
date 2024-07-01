package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    private _242_ValidAnagram testee = new _242_ValidAnagram();

    @Test
    void isAnagram1() {
        assertTrue(testee.isAnagram("anagram", "nagaram"));
    }
    @Test
    void isAnagram2() {
        assertFalse(testee.isAnagram("rat", "car"));
    }
}