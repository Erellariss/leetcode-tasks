package leetcode;

import leetcode._303_RangeSumQuery.NumArray;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _303_RangeSumQueryTest {

    @Test
    void name() {
        NumArray testee = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        assertEquals(1, testee.sumRange(0, 2));
        assertEquals(-1, testee.sumRange(2, 5));
        assertEquals(-3, testee.sumRange(0, 5));
        assertEquals(-1, testee.sumRange(5, 5));
    }

    @Test
    void name2() {
        NumArray testee = new NumArray(new int[]{1, 2, 3, 4, 5, 6});
        assertEquals(6, testee.sumRange(0, 2));
        assertEquals(21, testee.sumRange(0, 5));
        assertEquals(5, testee.sumRange(1, 2));

    }
}