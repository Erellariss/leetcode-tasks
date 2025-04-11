package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _567_PermutationInStringTest {

    private _567_PermutationInString testee = new _567_PermutationInString();

    @ParameterizedTest
    @MethodSource("vals")
    void name(boolean expected, String s1, String s2) {
        assertEquals(expected, testee.checkInclusion(s1, s2));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(true, "ab", "eidbaooo"),
                Arguments.of(false, "ab", "eidboaoo"),
                Arguments.of(true, "abc", "dcba")
        );
    }
}