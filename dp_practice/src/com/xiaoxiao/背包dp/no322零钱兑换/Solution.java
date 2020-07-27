package com.xiaoxiao.背包dp.no322零钱兑换;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: coins = [1, 2, 5], amount = 11
 * 输出: 3
 * 解释: 11 = 5 + 5 + 1
 *
 * @author Xiaoyu
 * @date 2020/5/31 - 9:51
 */
public class Solution {
    public int coinChange(int[] coins, int amount) {
        int nums = coins.length;
        Arrays.sort(coins);
        int[] dp = new int[amount + 1];//dp[i][j]代表前i个硬币的钱加起来为j最少个数
            Arrays.fill(dp,amount+1);
            dp[0] = 0;
        for (int j = 1; j <= amount; j++) {
            for (int i = 0; i < nums; i++) {
                if (j >= coins[i])
                dp[j] = Math.min(dp[j], dp[j - coins[i]]+1 );
                //else dp[i][j] = dp[i - 1][j]+ dp[i][j - coins[i - 1]];
            }
        }
        return dp[amount] == amount+1? -1:dp[amount];

    }
    public int coinChange1(int[] coins, int amount) {
        int nums = coins.length;
        int[][] dp = new int[nums + 1][amount + 1];//dp[i][j]代表前i个硬币的钱加起来为j最少个数
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], amount+1);
            if (i > 0) dp[i][0] = 0;
        }
        for (int i = 1; i <= nums; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j < coins[i - 1]) dp[i][j] = dp[i - 1][j];
                else dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - coins[i - 1]] + 1);
                //else dp[i][j] = dp[i - 1][j]+ dp[i][j - coins[i - 1]];
            }
        }
        return dp[nums][amount]== amount+1? -1:dp[nums][amount];
    }
}
