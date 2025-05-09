package leetcode;

import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class _131_PalindromePartitioningTest {

    private final _131_PalindromePartitioning testee = new _131_PalindromePartitioning();

    @ParameterizedTest
    @MethodSource("vals")
    void name(List<List<String>> expected, String s) {
        var partition = testee.partition(s);

        sortPartitions(partition);

        assertEquals(expected, partition);
    }

    private static Stream<Arguments> vals() {
        return Stream.of(
            Arguments.of(
                List.of(
                    List.of("aa", "b"),
                    List.of("a", "a", "b")
                    ),
                "aab"
            ),
            Arguments.of(
                List.of(
                    List.of("a")
                ),
                "a"
            )
        );
    }

    private static void sortPartitions(List<List<String>> partitions) {
        for (List<String> part : partitions) {
            part.sort(Comparator.naturalOrder()); // sort inner list
        }
        partitions.sort((a, b) -> {
            int cmp = Integer.compare(a.size(), b.size());
            if (cmp != 0) return cmp;
            for (int i = 0; i < a.size(); i++) {
                cmp = a.get(i).compareTo(b.get(i));
                if (cmp != 0) return cmp;
            }
            return 0;
        });
    }

}