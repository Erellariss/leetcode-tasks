package leetcode;

public class _121_BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int buyPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }

            profit = Math.max(profit, prices[i] - buyPrice);
        }
        return profit;
    }
}
