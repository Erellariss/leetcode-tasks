package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class _4_MedianOfTwoSortedArraysTest {

    private final _4_MedianOfTwoSortedArrays testee = new _4_MedianOfTwoSortedArrays();

    @ParameterizedTest
    @MethodSource("vals")
    void name(double expected, int[] nums1, int[] nums2) {
        assertEquals(expected, testee.findMedianSortedArrays(nums1, nums2));
    }

    private static Stream<Arguments> vals() {
        return Stream.of(
            Arguments.of(2.0, new int[] { 1, 3 }, new int[] { 2 }),
            Arguments.of(2.5, new int[] { 1, 2 }, new int[] { 3, 4 }),
            Arguments.of(3, new int[] { 1, 3 }, new int[] { 2, 4, 5 })
        );
    }
}