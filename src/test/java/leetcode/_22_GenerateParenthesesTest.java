package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _22_GenerateParenthesesTest {

    private final _22_GenerateParentheses testee = new _22_GenerateParentheses();

    @ParameterizedTest
    @MethodSource("vals")
    void name(List<String> expected, int n) {
        assertIterableEquals(expected, testee.generateParenthesis(n));
    }

    private static Stream<Arguments> vals() {
        return Stream.of(
            Arguments.of(List.of("((()))","(()())","(())()","()(())","()()()"), 3),
            Arguments.of(List.of("()"), 1)
        );
    }
}