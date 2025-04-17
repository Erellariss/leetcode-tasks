package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _316_RemoveDuplicateLettersTest {

    private _316_RemoveDuplicateLetters testee = new _316_RemoveDuplicateLetters();

    @ParameterizedTest
    @MethodSource("vals")
    void name(String expected, String input) {
        assertEquals(expected, testee.removeDuplicateLetters(input));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of("abc", "bcabc"),
                Arguments.of("acdb", "cbacdcbc")
        );
    }
}