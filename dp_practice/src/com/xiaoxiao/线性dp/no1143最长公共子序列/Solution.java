package com.xiaoxiao.线性dp.no1143最长公共子序列;

/**
 * @author Xiaoyu
 * @date 2020/5/4 - 21:01
 */
public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        if (len1 == 0 || len2 == 0) return 0;
        int[] dp = new int[len2 + 1];
        for (int i = 1; i <= len1; i++) {
            for (int j = len2; j > 0; j--) {
                if (text1.charAt(i-1) == text2.charAt(j-1 )) dp[j] = dp[j - 1] + 1;//dp[i][j] = dp[i-1][j-1]+1
                else dp[j] = Math.max(dp[j], dp[j - 1]);//dp[i][j] = Math.max(dp[i][j],dp[i-1][j-1])
            }
        }
        return dp[1];
    }
}
