package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _122_BestTimeToBuySellStock2Test {

    private _122_BestTimeToBuySellStock2 testee = new _122_BestTimeToBuySellStock2();

    @Test
    void case1() {
        assertEquals(7, testee.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void case2() {
        assertEquals(4, testee.maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void case3() {
        assertEquals(0, testee.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}