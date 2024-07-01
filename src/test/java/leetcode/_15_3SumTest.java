package leetcode;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertEquals;

class _15_3SumTest {
    private _15_3Sum testee = new _15_3Sum();

    @Test
    void case1() {
        assertEquals(of(asList(-1, -1, 2), asList(-1, 0, 1)), testee.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        assertEquals(of(), testee.threeSum(new int[]{0, 1, 1}));
        assertEquals(of(asList(0, 0, 0)), testee.threeSum(new int[]{0, 0, 0}));
    }
}