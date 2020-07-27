package com.xiaoxiao.区间dp.no516最长回文子序列;

import java.util.Arrays;

/**
 * 给定一个字符串s，找到其中最长的回文子序列，并返回该序列的长度。可以假设s的最大长度为1000。
 * 示例 1:
 * 输入:
 * "bbbab"
 * 输出:
 * 4
 * 一个可能的最长回文子序列为 "bbbb"。
 *
 * @author Xiaoyu
 * @date 2020/5/26 - 23:38
 */
public class Solution {
    public int longestPalindromeSubseq(String s) {
        if (s == null || s.length() == 0) return 0;
        int len = s.length();
        int[][] dp = new int[len + 1][len + 1];
        for (int j = 0; j < dp.length; j++) {
            dp[j][j] = 1;
        }
        for (int r = 1; r <= len; r++) {
            for (int l = r-1; l >=1; l--) {
                if (s.charAt(l - 1) == s.charAt(r - 1))
                    dp[l][r] = Math.max(dp[l][r], dp[l + 1][r - 1] + 2);
                else {
                    /*//1.不选第l个字符
                    dp[l][r] = Math.max(dp[l][r], dp[l + 1][r]);
                    //2.不选第r个字符
                    dp[l][r] = Math.max(dp[l][r], dp[l][r - 1]);*/
                    dp[l][r] = Math.max(dp[l][r - 1], dp[l + 1][r]);

                }
            }
        }
        return dp[1][len];
    }
}
