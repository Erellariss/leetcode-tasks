package leetcode;

import java.util.Arrays;

/*
https://leetcode.com/problems/coin-change/description/
https://leetcode.com/problems/coin-change/solutions/3839103/recursive-approach-recursion-with-memoization-top-down-tabulation-method-bottom-up/
 */
public class _322_CoinChange {
    public int coinChange(int[] coins, int amount) {
        return coinCountBottomUp(coins, amount);
    }


    /**
     * recursion (top-down) approach
     * TC = O (n^amount)
     */
    private int coinCount(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        int min = -1;
        for (int coin : coins) {
            int ans = coinCount(coins, amount - coin);
            if (ans != -1) {
                if (min == -1) {
                    min = ans + 1;
                }
                min = Math.min(min, ans + 1);
            }
        }
        return min;
    }

    /**
     * Top-down + memoization
     * TC = O(n*amount)
     * SC = O(amount)
     */
    private int coinCount(int[] coins, int amount, int[] dp) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        if (dp == null) {
            dp = new int[amount + 1];
            Arrays.fill(dp, -1);
        }
        if (dp[amount] != -1) {
            return dp[amount];
        }
        int min = -1;
        for (int coin : coins) {
            int ans = coinCount(coins, amount - coin, dp);
            if (ans != -1) {
                if (min == -1) {
                    min = ans + 1;
                }
                min = Math.min(min, ans + 1);
            }
        }
        return dp[amount] = min;
    }

    /**
     * Bottom-up + memoization
     * TC = O(n*amount)
     * SC = O(amount)
     */
    private int coinCountBottomUp(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] != -1) {
                    if (dp[i] == -1) {
                        dp[i] = 1 + dp[i - coin];
                    }
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        return dp[amount];
    }

}
