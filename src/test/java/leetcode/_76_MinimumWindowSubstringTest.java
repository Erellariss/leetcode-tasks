package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _76_MinimumWindowSubstringTest {

    private _76_MinimumWindowSubstring testee = new _76_MinimumWindowSubstring();

    @ParameterizedTest
    @MethodSource("vals")
    void name(String expected, String s, String t) {
        assertEquals(expected, testee.minWindow(s, t));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of("BANC", "ADOBECODEBANC", "ABC"),
                Arguments.of("a", "a", "a"),
                Arguments.of("", "a", "aa"),
                Arguments.of("b", "ab", "b"),
                Arguments.of("cwae", "cabwefgewcwaefgcf", "cae"),
                Arguments.of("cabd", "abcabdebac", "cda")

        );
    }
}