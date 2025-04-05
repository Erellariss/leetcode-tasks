package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _151_ReverseWordsInAStringTest {

    private final _151_ReverseWordsInAString testee = new _151_ReverseWordsInAString();

    @ParameterizedTest
    @MethodSource("args")
    void test(String input, String expected) {
        assertEquals(expected, testee.reverseWords(input));
    }

    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of("the sky is blue", "blue is sky the"),
                Arguments.of("  hello world  ", "world hello"),
                Arguments.of("a good   example", "example good a")
        );
    }


}