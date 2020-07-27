package com.xiaoxiao.weekrace.no3;

/**5438. 制作 m 束花所需的最少天数  显示英文描述
 通过的用户数 233
 尝试过的用户数 362
 用户总通过次数 235
 用户总提交次数 465
 题目难度 Medium
 给你一个整数数组 bloomDay，以及两个整数 m 和 k 。

 现需要制作 m 束花。制作花束时，需要使用花园中 相邻的 k 朵花 。

 花园中有 n 朵花，第 i 朵花会在 bloomDay[i] 时盛开，恰好 可以用于 一束 花中。

 请你返回从花园中摘 m 束花需要等待的最少的天数。如果不能摘到 m 束花则返回 -1 。
 * @author Xiaoyu
 * @date 2020/6/14 - 10:26
 */
public class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length) return -1;
        int n = bloomDay.length;
        int[][] dp = new int[n][n];//表示i,j全部开花的最短时间
        for (int i = 0; i < bloomDay.length; i++) {
            dp[i][i] = bloomDay[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                dp[i][j] = Math.max(dp[i][j-1],bloomDay[j]);
            }
        }
        int minDay = dp[0][k-1];
        for (int i = 0; i < n; i++) {

        }
        return 0;
    }
}
