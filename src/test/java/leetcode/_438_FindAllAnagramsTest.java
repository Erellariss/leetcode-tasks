package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _438_FindAllAnagramsTest {

    private _438_FindAllAnagrams testee = new _438_FindAllAnagrams();

    @ParameterizedTest
    @MethodSource("vals")
    void name(List<Integer> expected, String s, String p) {
        List<Integer> actual = testee.findAnagrams(s, p);
        assertTrue(expected.containsAll(actual));
        assertEquals(expected.size(), actual.size());
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(List.of(0,6), "cbaebabacd", "abc"),
                Arguments.of(List.of(0,1,2), "abab", "ab")
        );
    }
}