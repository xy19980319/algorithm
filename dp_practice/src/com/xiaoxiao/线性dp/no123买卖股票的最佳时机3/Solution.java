package com.xiaoxiao.线性dp.no123买卖股票的最佳时机3;

import java.util.Arrays;

/**
 * 给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你最多可以完成 两笔 交易。
 * 注意: 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * <p>
 * 示例 1:
 * 输入: [3,3,5,0,0,3,1,4]
 * 输出: 6
 * 解释: 在第 4 天（股票价格 = 0）的时候买入，在第 6 天（股票价格 = 3）的时候卖出，这笔交易所能获得利润 = 3-0 = 3 。
 *      随后，在第 7 天（股票价格 = 1）的时候买入，在第 8 天 （股票价格 = 4）的时候卖出，这笔交易所能获得利润 = 4-1 = 3 。
 *
 * @author Xiaoyu
 * @date 2020/5/11 - 11:46
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2) return 0;
        int[] dp1 = new int[2];//第i天,持有状态是0,1,还能买k次股票
        int[] dp2 = new int[2];//第i天,持有状态是0,1,还能买k次股票
        Arrays.fill(dp2, Integer.MIN_VALUE);//这一步是关键,需要将所有值变成最小,不然第二次买股的时候回调用0进行累加,这样就会出错
        dp1[1] = -prices[0];
        for (int i = 2; i <= len; i++) {
            //压缩内存,滚动数组更新值
            dp1[0] = Math.max(dp1[0], dp1[1] + prices[i - 1]);
            dp1[1] = Math.max(dp1[1], -prices[i - 1]);
            dp2[1] = Math.max(dp2[1], dp1[0] - prices[i - 1]);
            dp2[0] = Math.max(dp2[0], dp2[1] + prices[i - 1]);
        }
        return Math.max(dp1[0], dp2[0]);
    }

    public int maxProfit1(int[] prices) {
        int len = prices.length;
        if (len < 2) return 0;
        int[][] dp1 = new int[len + 1][2];//第i天,持有状态是0,1,还能买k次股票
        int[][] dp2 = new int[len + 1][2];//第i天,持有状态是0,1,还能买k次股票
        for (int i = 0; i <= len; i++) {
            Arrays.fill(dp1[i], Integer.MIN_VALUE);
            Arrays.fill(dp2[i], Integer.MIN_VALUE);
        }
        dp1[1][0] = 0;
        dp1[1][1] = -prices[0];
        for (int i = 2; i <= len; i++) {
            dp1[i][0] = Math.max(dp1[i - 1][0], dp1[i - 1][1] + prices[i - 1]);
            dp1[i][1] = Math.max(dp1[i - 1][1], -prices[i - 1]);
        }
        for (int i = 2; i <= len; i++) {
            dp2[i][1] = Math.max(dp2[i - 1][1], dp1[i - 1][0] - prices[i - 1]);
            dp2[i][0] = Math.max(dp2[i - 1][0], dp2[i - 1][1] + prices[i - 1]);
        }
        return Math.max(dp1[len][0], dp2[len][0]);
    }
}
