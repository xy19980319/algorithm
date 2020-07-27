package com.xiaoxiao.背包dp.no518零钱兑换2;

import java.util.Arrays;

/**
 * @author Xiaoyu
 * @date 2020/6/6 - 10:37
 */
public class Solution {
    public int change(int amount, int[] coins) {
        int nums = coins.length;
        int[] dp = new int[amount + 1];//dp[i][j]代表前i个硬币的钱加起来为j方案书
            dp[0] = 1;
            for (int i = 1; i <= nums; i++) {
                for (int j = coins[i - 1]; j <= amount; j++) {
                     dp[j] = dp[j] + dp[j - coins[i - 1]];
            }
        }
        return dp[amount];
    }
    public int change1(int amount, int[] coins) {
        int nums = coins.length;
        int[][] dp = new int[nums + 1][amount + 1];//dp[i][j]代表前i个硬币的钱加起来为j方案书
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= nums; i++) {
            for (int j = 1; j <= amount; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= coins[i - 1]) dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];
            }
        }
        return dp[nums][amount];
    }
}
