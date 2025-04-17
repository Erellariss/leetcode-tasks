package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _32_LongestValidParenthesesTest {

    private _32_LongestValidParentheses testee = new _32_LongestValidParentheses();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int expected, String input) {
        assertEquals(expected, testee.longestValidParentheses(input));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(2, "(()"),
                Arguments.of(4, ")()())"),
                Arguments.of(4, "(()()("),
                Arguments.of(0, ""),
                Arguments.of(2, "()(()"),
                Arguments.of(6, "()(())")
        );
    }
}