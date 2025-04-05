package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _238_ProductOfArrayExpectSelfTest {

    private _238_ProductOfArrayExpectSelf testee = new _238_ProductOfArrayExpectSelf();

    @Test
    void name() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, testee.productExceptSelf(new int[]{1, 2, 3, 4}));
    }

    @Test
    void name2() {
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, testee.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }
}