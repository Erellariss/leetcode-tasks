package leetcode;

import static java.util.List.of;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import utlis.PermutationTestUtils;

class _46_PermutationsTest {

    private final _46_Permutations testee = new _46_Permutations();

    @ParameterizedTest
    @MethodSource("vals")
    void name(List<List<Integer>> expected, int[] nums) {
        PermutationTestUtils.assertHasAllPermutations(nums, testee.permute(nums));
    }

    private static Stream<Arguments> vals() {
        return Stream.of(
            Arguments.of(of(of(1, 2, 3), of(1, 3, 2), of(2, 1, 3), of(2, 3, 1), of(3, 1, 2), of(3, 2, 1)),
                new int[] { 1, 2, 3 }),
            Arguments.of(of(of(0, 1), of(1, 0)), new int[] { 0, 1 }),
            Arguments.of(of(of(1)), new int[] { 1 })
        );
    }
}