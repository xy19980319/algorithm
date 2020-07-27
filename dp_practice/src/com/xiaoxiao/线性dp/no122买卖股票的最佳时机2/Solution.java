package com.xiaoxiao.线性dp.no122买卖股票的最佳时机2;

/**
 * @author Xiaoyu
 * @date 2020/5/11 - 10:27
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len<2) return 0;
        int[][] dp = new int[len + 1][2];
        dp[0][0] = 0;
        dp[1][0] = 0;
        dp[1][1] = -prices[0];
        for (int i = 2; i <= len; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i-1]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0] - prices[i-1]);
        }
        return dp[len][0];
    }
}
