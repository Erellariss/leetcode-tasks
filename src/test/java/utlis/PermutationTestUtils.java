package utlis;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class PermutationTestUtils {

    public static void assertHasAllPermutations(int[] input, List<List<Integer>> actualPermutations) {
        Set<List<Integer>> expected = new HashSet<>();
        generatePermutations(input, new boolean[input.length], new ArrayList<>(), expected);

        Set<List<Integer>> actual = new HashSet<>(actualPermutations);

        if (!expected.equals(actual)) {
            Set<List<Integer>> missing = new HashSet<>(expected);
            missing.removeAll(actual);

            Set<List<Integer>> unexpected = new HashSet<>(actual);
            unexpected.removeAll(expected);

            StringBuilder errorMsg = new StringBuilder("Permutation mismatch:\n");
            if (!missing.isEmpty()) {
                errorMsg.append("Missing permutations: ").append(missing).append("\n");
            }
            if (!unexpected.isEmpty()) {
                errorMsg.append("Unexpected permutations: ").append(unexpected).append("\n");
            }
            fail(errorMsg.toString());
        }
    }

    private static void generatePermutations(int[] input, boolean[] used, List<Integer> current, Set<List<Integer>> result) {
        if (current.size() == input.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < input.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            current.add(input[i]);
            generatePermutations(input, used, current, result);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}

