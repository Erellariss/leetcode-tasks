package leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _78_SubsetsTest {

    private final _78_Subsets testee = new _78_Subsets();

    // ✅ Verification: Empty input
    @Test
    public void testEmptyInput() {
        List<List<Integer>> result = subsets(new int[]{});
        assertEquals(1, result.size());
        assertTrue(result.contains(Collections.emptyList()));
    }

    // ✅ Verification: One element
    @Test
    public void testSingleElement() {
        List<List<Integer>> result = subsets(new int[]{1});
        Set<Set<Integer>> actual = toSetOfSets(result);
        Set<Set<Integer>> expected = Set.of(
            Set.of(),
            Set.of(1)
        );
        assertEquals(expected, actual);
    }

    // ✅ Verification: {1, 2, 3}
    @Test
    public void testThreeElements() {
        int[] input = {1, 2, 3};
        List<List<Integer>> result = subsets(input);

        // 2^3 = 8 subsets expected
        assertEquals(8, result.size());

        Set<Set<Integer>> actual = toSetOfSets(result);
        Set<Set<Integer>> expected = Set.of(
            Set.of(),
            Set.of(1), Set.of(2), Set.of(3),
            Set.of(1, 2), Set.of(1, 3), Set.of(2, 3),
            Set.of(1, 2, 3)
        );

        assertEquals(expected, actual);
    }

    // ✅ Helper: convert List<List<Integer>> → Set<Set<Integer>> to ignore order and duplicates
    private Set<Set<Integer>> toSetOfSets(List<List<Integer>> lists) {
        Set<Set<Integer>> set = new HashSet<>();
        for (List<Integer> list : lists) {
            set.add(new HashSet<>(list));
        }
        return set;
    }

    // Dummy placeholder; replace with your actual implementation
    public List<List<Integer>> subsets(int[] nums) {
        return testee.subsets(nums);
    }
}