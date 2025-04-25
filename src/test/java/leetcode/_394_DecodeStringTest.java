package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _394_DecodeStringTest {

    private final _394_DecodeString testee = new _394_DecodeString();

    @ParameterizedTest
    @MethodSource("vals")
    void name(String expected, String input) {
        assertEquals(expected, testee.decodeString(input));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of("aaabcbc", "3[a]2[bc]"),
                Arguments.of("accaccacc", "3[a2[c]]"),
                Arguments.of("abcabccdcdcdef", "2[abc]3[cd]ef")
        );
    }
}