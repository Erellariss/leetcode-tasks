package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _205_IsomorphicStringsTest {

    private _205_IsomorphicStrings testee = new _205_IsomorphicStrings();

    @ParameterizedTest
    @MethodSource("vals")
    void name(boolean expected, String a, String b) {
        assertEquals(expected, testee.isIsomorphic(a, b));
    }

    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(true, "egg", "add"),
                Arguments.of(false, "foo", "bar"),
                Arguments.of(false, "bbbaaaba", "aaabbbba"),
                Arguments.of(true, "paper", "title")
        );
    }
}