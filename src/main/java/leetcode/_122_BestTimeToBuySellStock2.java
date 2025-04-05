package leetcode;

public class _122_BestTimeToBuySellStock2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                profit += prices[i] - buyPrice;
            }
            buyPrice = prices[i];
        }

        return profit;
    }

}
