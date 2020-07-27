package com.xiaoxiao.线性dp.no309最佳买卖股票时机含冷冻期;

import java.util.Arrays;

/**给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。​
 设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
 示例:
 输入: [1,2,3,0,2]
 输出: 3
 解释: 对应的交易状态为: [买入, 卖出, 冷冻期, 买入, 卖出]
 * @author Xiaoyu
 * @date 2020/5/13 - 20:57
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int len =prices.length;
        if(len<2) return 0;
        int[] dp = new int[3];//第一维是天,从1-len天,后面是状态,0表示没持股,1表示持股,2表示真空期未持股状态
        dp[2]=Integer.MIN_VALUE;
        //dp[0]=0;//第一天未持股,默认初始化为0了
        dp[1]=-prices[0];//第一天持股
        for (int i = 2; i <= len; i++) {
            dp[1] = Math.max(dp[1],dp[0] - prices[i-1]);
            dp[0] = Math.max(dp[0],dp[2]);
            dp[2] = Math.max(dp[2],dp[1]+prices[i-1]);
        }
        return Math.max(dp[0],dp[2]);
    }
    public int maxProfit2(int[] prices) {
        int len =prices.length;
        if(len<2) return 0;
        int[][] dp = new int[2][3];//第一维是天,从1-len天,后面是状态,0表示没持股,1表示持股
        for (int i = 0; i <= 1; i++) {
            Arrays.fill(dp[i],Integer.MIN_VALUE);
        }
        dp[1][0]=0;//第一天未持股
        dp[1][1]=-prices[0];//第一天持股
        for (int i = 2; i <= len; i++) {
            dp[i%2][1] = Math.max(dp[(i-1)%2][1],dp[(i-1)%2][0] - prices[i-1]);
            dp[i%2][2] = Math.max(dp[(i-1)%2][2],dp[(i-1)%2][1]+prices[i-1]);
            dp[i%2][0] = Math.max(dp[(i-1)%2][0],dp[(i-1)%2][2]);
        }
        return Math.max(dp[len%2][0],dp[len%2][2]);
    }
    public int maxProfit1(int[] prices) {
        int len =prices.length;
        if(len<2) return 0;
        int[][] dp = new int[len+1][3];//第一维是天,从1-len天,后面是状态,0表示没持股,1表示持股
        for (int i = 0; i <= len; i++) {
            Arrays.fill(dp[i],Integer.MIN_VALUE);
        }
        dp[1][0]=0;//第一天未持股
        dp[1][1]=-prices[0];//第一天持股
        for (int i = 2; i <= len; i++) {
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0] - prices[i-1]);
            dp[i][2] = Math.max(dp[i-1][2],dp[i-1][1]+prices[i-1]);
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][2]);
        }
        return Math.max(dp[len][0],dp[len][2]);
    }
}
