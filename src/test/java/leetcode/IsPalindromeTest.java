package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeTest {

    IsPalindrome testee = new IsPalindrome();

    @Test
    void isPalindrome() {
        Assertions.assertTrue(testee.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void isPalindrome2() {
        Assertions.assertFalse(testee.isPalindrome("race a car"));
    }

    @Test
    void isPalindrome3() {
        Assertions.assertTrue(testee.isPalindrome(" "));
    }

    @Test
    void isPalindrome4() {
        Assertions.assertTrue(testee.isPalindrome(".,"));
    }

    @Test
    void isPalindrome5() {
        Assertions.assertFalse(testee.isPalindrome("0P"));
    }


}