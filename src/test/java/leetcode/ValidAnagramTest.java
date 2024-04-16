package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    private ValidAnagram testee = new ValidAnagram();

    @Test
    void isAnagram1() {
        assertTrue(testee.isAnagram("anagram", "nagaram"));
    }
    @Test
    void isAnagram2() {
        assertFalse(testee.isAnagram("rat", "car"));
    }
}