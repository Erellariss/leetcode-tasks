package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.fail;

class _49_GroupAnagramsTest {

    private _49_GroupAnagrams testee = new _49_GroupAnagrams();

    @ParameterizedTest
    @MethodSource("vals")
    void name(String[] input, List<List<String>> expected) {
        assertNestedListEqualsIgnoreOrder(expected, testee.groupAnagrams(input));
    }

    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}, of(of("eat", "tea", "ate"), of("bat"), of("tan", "nat"))),
                Arguments.of(new String[]{""}, of(of(""))),
                Arguments.of(new String[]{"a"}, of(of("a"))),
                Arguments.of(new String[]{"cab","tin","pew","duh","may","ill","buy","bar","max","doc"}, of(of("max"), of("duh"), of("doc"), of("buy"), of("may"), of("ill"), of("tin"), of("bar"), of("pew"), of("cab")))
        );
    }

    public static void assertNestedListEqualsIgnoreOrder(List<List<String>> expected, List<List<String>> actual) {
        // Normalize both: sort inner lists
        List<List<String>> normalizedExpected = normalize(expected);
        List<List<String>> normalizedActual = normalize(actual);

        // Compare as sets to ignore outer order
        Set<List<String>> expectedSet = new HashSet<>(normalizedExpected);
        Set<List<String>> actualSet = new HashSet<>(normalizedActual);

        if (!expectedSet.equals(actualSet)) {
            fail("Expected: " + expectedSet + "\nActual:   " + actualSet);
        }
    }

    private static List<List<String>> normalize(List<List<String>> list) {
        List<List<String>> result = new ArrayList<>();
        for (List<String> inner : list) {
            List<String> sortedInner = new ArrayList<>(inner);
            Collections.sort(sortedInner); // Order within sublists doesn't matter
            result.add(sortedInner);
        }
        return result;
    }
}