package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _162_FindPeakElementTest {

    private final _162_FindPeakElement testee = new _162_FindPeakElement();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int expected, int[] ints) {
        assertEquals(expected, testee.findPeakElement(ints));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(2,new int[]{1,2,3,1}),
                Arguments.of(5,new int[]{1,2,1,3,5,6,4})
        );
    }
}