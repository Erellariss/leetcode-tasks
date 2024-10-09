package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _322_CoinChangeTest {
    
    private static final  _322_CoinChange testee = new _322_CoinChange();

    @Test
    void case1() {
        assertEquals(3, testee.coinChange(new int[]{1,2,5}, 11));
    }
    @Test
    void case2() {
        assertEquals(-1, testee.coinChange(new int[]{2}, 3));
    }
    @Test
    void case3() {
        assertEquals(0, testee.coinChange(new int[]{1}, 0));
    }
}