package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _215_KthLargestElementTest {

    private final _215_KthLargestElement testee = new _215_KthLargestElement();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int expected, int[] nums, int k) {
        assertEquals(expected, testee.findKthLargest(nums, k));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(5, new int[]{3, 2, 1, 5, 6, 4}, 2),
                Arguments.of(4, new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4)
        );
    }
}