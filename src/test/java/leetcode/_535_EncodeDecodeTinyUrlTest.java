package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _535_EncodeDecodeTinyUrlTest {

    private _535_EncodeDecodeTinyUrl testee = new _535_EncodeDecodeTinyUrl();

    @ParameterizedTest
    @MethodSource("vals")
    void name(String input) {
        assertEquals(input, testee.decode(testee.encode(input)));
    }

    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of("https://leetcode.com/problems/design-tinyurl")
        );
    }
}