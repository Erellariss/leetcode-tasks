package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _167_TwoSum2Test {

    private _167_TwoSum2 testee = new _167_TwoSum2();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int[] expected, int[] nums, int target) {
        var actual = testee.twoSum(nums, target);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}, new int[]{2, 7, 11, 15}, 9),
                Arguments.of(new int[]{1, 3}, new int[]{2, 3, 4}, 6),
                Arguments.of(new int[]{1, 2}, new int[]{-1, 0}, -1),
                Arguments.of(new int[]{1, 2}, new int[]{0, 0, 3, 4}, 0)
        );
    }
}