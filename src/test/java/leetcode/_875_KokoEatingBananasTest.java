package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class _875_KokoEatingBananasTest {

    private final _875_KokoEatingBananas testee = new _875_KokoEatingBananas();

    @ParameterizedTest
    @MethodSource("vals")
    void name(int expected, int[] piles, int h) {
        assertEquals(expected, testee.minEatingSpeed(piles, h));
    }

    private static Stream<Arguments> vals() {
        return Stream.of(
            Arguments.of(4, new int[] { 3, 6, 7, 11 }, 8),
            Arguments.of(30, new int[] { 30, 11, 23, 4, 20 }, 5),
            Arguments.of(23, new int[] { 30, 11, 23, 4, 20 }, 6)
        );
    }
}