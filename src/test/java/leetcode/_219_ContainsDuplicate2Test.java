package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _219_ContainsDuplicate2Test {

    private _219_ContainsDuplicate2 testee = new _219_ContainsDuplicate2();

    @ParameterizedTest
    @MethodSource("vals")
    void name(boolean expected, int[] nums, int k) {
        assertEquals(expected, testee.containsNearbyDuplicate(nums, k));
    }

    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(true, new int[]{1,2,3,1}, 3),
                Arguments.of(true, new int[]{1,0,1,1}, 1),
                Arguments.of(false, new int[]{1,2,3,1,2,3}, 2)
        );
    }
}