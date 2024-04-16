package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuySellStockTest {

    @Test
    void maxProfit() {
        Assertions.assertEquals(5, BestTimeToBuySellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void maxProfit2() {
        Assertions.assertEquals(1, BestTimeToBuySellStock.maxProfit(new int[]{1, 2}));
    }

    @Test
    void maxProfitZero() {
        Assertions.assertEquals(0, BestTimeToBuySellStock.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}