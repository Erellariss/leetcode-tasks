package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _692_TopKFrequentWordsTest {

    private final _692_TopKFrequentWords testee = new _692_TopKFrequentWords();

    @ParameterizedTest
    @MethodSource("vals")
    void name(List<String> expected, String[] input, int k) {
        assertIterableEquals(expected, testee.topKFrequent(input, k));
    }


    private static Stream<Arguments> vals() {
        return Stream.of(
                Arguments.of(List.of("i", "love"), new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2),
                Arguments.of(List.of("the", "is", "sunny", "day"), new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4)
        );
    }
}