package com.xiaoxiao.线性dp.no188买卖股票的最佳时机4;

import java.util.Arrays;

/**
 * 给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。
 * 注意: 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 示例 1:
 * 输入: [2,4,1], k = 2
 * 输出: 2
 * 解释: 在第 1 天 (股票价格 = 2) 的时候买入，在第 2 天 (股票价格 = 4) 的时候卖出，这笔交易所能获得利润 = 4-2 = 2 。
 *
 * @author Xiaoyu
 * @date 2020/5/13 - 11:29
 */
public class Solution {
    public int maxProfit(int k, int[] prices) {
        if (k == 0) return 0;
        int len = prices.length;
        if (len < 2) return 0;
        int dp[] = new int[2];

        //Arrays.fill(dp, -9999);


        //dp[0][0] = 0;
        //dp[0] = 0;
        dp[1] = -prices[0];

        for (int i = 1; i < len; i++) {
            for (int j = k - 1; j >= 0; j--) {
                /*if (j == 0) {
                    dp[j][0] = Math.max(dp[j][0], dp[j][1] + prices[i]);
                    dp[j][1] = Math.max(dp[j][1], -prices[i]);
                    continue;
                }*/
                dp[0] = Math.max(dp[0], dp[1] + prices[i]);
                dp[1] = Math.max(dp[1],dp[0] - prices[i]);
            }
        }

        return dp[0];
    }

    public int maxProfit4(int k, int[] prices) {

        if (k == 0) return 0;
        int len = prices.length;
        if (len < 2) return 0;
        int dp1[] = new int[2];
        int dp2[] = new int[2];

        Arrays.fill(dp1, -9999);
        Arrays.fill(dp2, -9999);

        //dp[0][0] = 0;
        dp1[1] = -prices[0];

        for (int i = 2; i <= len; i++) {
            for (int j = 1; j <= k; j++) {
                if (j == 1) {
                    dp1[0] = Math.max(dp1[0], dp1[1] + prices[i - 1]);
                    dp1[1] = Math.max(dp1[1], -prices[i - 1]);
                    continue;
                }
                if (j % 2 == 1) {
                    dp1[0] = Math.max(dp1[0], dp1[1] + prices[i - 1]);
                    dp1[1] = Math.max(dp1[1], dp2[1] - prices[i - 1]);
                } else if (j % 2 == 0) {
                    dp2[0] = Math.max(dp2[0], dp2[1] + prices[i - 1]);
                    dp2[1] = Math.max(dp2[1], dp1[0] - prices[i - 1]);
                }
            }
        }
        return Math.max(dp1[0], dp2[0]);
    }

    public int maxProfit3(int k, int[] prices) {
        /**
         * 这个解法有问题
         */
        if (k == 0) return 0;
        int len = prices.length;
        if (len < 2) return 0;
        int dp[][] = new int[2][2];

        for (int j = 0; j < 2; j++) {
            Arrays.fill(dp[j], -9999);
        }

        //dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < k; j++) {
                if (j == 0) {
                    dp[j % 2][0] = Math.max(dp[j % 2][0], dp[j % 2][1] + prices[i]);
                    dp[j % 2][1] = Math.max(dp[j % 2][1], -prices[i]);
                    continue;
                }
                dp[j % 2][0] = Math.max(dp[j % 2][0], dp[j % 2][1] + prices[i]);
                dp[j % 2][1] = Math.max(dp[j % 2][1], dp[(j - 1) % 2][1] - prices[i]);


            }
        }
        int res = 0;
        for (int i = 0; i < 2; i++) {
            res = Math.max(res, dp[i][0]);
        }
        return res;
    }

    public int maxProfit2plus(int k, int[] prices) {
        if (k == 0) return 0;
        int len = prices.length;
        if (len < 2) return 0;
        int dp[][] = new int[2][2];

        for (int j = 0; j < 2; j++) {
            Arrays.fill(dp[j], -9999);
        }

        //dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int j = 0; j < k; j++) {

            for (int i = 1; i < len; i++) {
                if (j == 0) {
                    dp[j][0] = Math.max(dp[j][0], dp[j][1] + prices[i]);
                    dp[j][1] = Math.max(dp[j][1], -prices[i]);
                    continue;
                }
                dp[j % 2][0] = Math.max(dp[j % 2][0], dp[j % 2][1] + prices[i]);
                dp[j % 2][1] = Math.max(dp[j % 2][1], dp[(j - 1) % 2][0] - prices[i]);
            }
        }
        int res = 0;
        for (int i = 0; i < 2; i++) {
            res = Math.max(res, dp[i][0]);
        }
        return res;
    }

    public int acmaxProfit2(int k, int[] prices) {
        if (k == 0) return 0;
        int len = prices.length;
        if (k >= prices.length / 2) return greedy(prices);
        if (len < 2) return 0;
        int dp[][] = new int[k][2];
        for (int j = 0; j < k; j++) {
            Arrays.fill(dp[j], -9999);
        }

        //dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < k; j++) {
                if (j == 0) {
                    dp[j][0] = Math.max(dp[j][0], dp[j][1] + prices[i]);
                    dp[j][1] = Math.max(dp[j][1], -prices[i]);
                    continue;
                }
                dp[j][0] = Math.max(dp[j][0], dp[j][1] + prices[i]);
                dp[j][1] = Math.max(dp[j][1], dp[j - 1][0] - prices[i]);
            }
        }
        int res = 0;
        for (int i = 0; i < k; i++) {
            res = Math.max(res, dp[i][0]);
        }
        return res;
    }

    private int greedy(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] > prices[i - 1])
                max += prices[i] - prices[i - 1];
        }
        return max;
    }

    public int maxProfit1(int k, int[] prices) {
        if (k == 0) return 0;
        int len = prices.length;
        if (len < 2) return 0;
        int dp[][][] = new int[len][k][2];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < k; j++) {
                Arrays.fill(dp[i][j], -9999);
            }
        }
        dp[0][0][0] = 0;
        dp[0][0][1] = -prices[0];
        for (int j = 0; j < k; j++) {
            for (int i = 1; i < len; i++) {
                if (j == 0) {
                    dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
                    dp[i][j][1] = Math.max(dp[i - 1][j][1], -prices[i]);
                    continue;
                }
                dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
            }
        }
        int res = 0;
        for (int i = 0; i < k; i++) {
            res = Math.max(res, dp[len - 1][i][0]);
        }
        return res;
    }
}
