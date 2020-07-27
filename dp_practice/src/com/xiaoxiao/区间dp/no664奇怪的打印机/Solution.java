package com.xiaoxiao.区间dp.no664奇怪的打印机;

/**
 * 有台奇怪的打印机有以下两个特殊要求：
 * <p>
 * 打印机每次只能打印同一个字符序列。
 * 每次可以在任意起始和结束位置打印新字符，并且会覆盖掉原来已有的字符。
 * 给定一个只包含小写英文字母的字符串，你的任务是计算这个打印机打印它需要的最少次数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "aaabbb"
 * 输出: 2
 * 解释: 首先打印 "aaa" 然后打印 "bbb"。
 *
 * @author Xiaoyu
 * @date 2020/6/1 - 23:37
 */
public class Solution {
    public int strangePrinter(String s) {
        //区间dp
        if (s == null || s.length() == 0) return 0;
        int N = s.length();
        int[][] dp = new int[N][N];

        char[] chars = s.toCharArray();//字符数组

        //初始化
        for (int i = 0; i < N; i++) {
            dp[i][i] = 1;
        }

        //定义区间长度
        for (int len = 2; len <= N; len++) {
            //定义左端点
            for (int left = 0; left < N; left++) {
                int right = left + len - 1;//定义右端点
                if (right > N) break;//设置越界条件
                //如果区间两端字符相等,那么一次就可以打印出来
                if (chars[left] == chars[right])
                    dp[left][right] = dp[left][right - 1];
                else {
                    //最坏情况必须自己打印
                    dp[left][right] = dp[left][right - 1] + 1;
                    //枚举切割端点
                    for (int k = left; k < right; k++) {
                        if(chars[k] == chars[right])
                        dp[left][right] = Math.min(dp[left][right],dp[left][k-1]+dp[k+1][right]);
                    }
                }

            }
        }
        return dp[0][N-1];
    }
}
