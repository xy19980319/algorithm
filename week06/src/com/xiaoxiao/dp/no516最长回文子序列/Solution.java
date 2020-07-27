package com.xiaoxiao.dp.no516最长回文子序列;

/**
 * 给定一个字符串s，找到其中最长的回文子序列。可以假设s的最大长度为1000。
 * 示例 1:
 * 输入:
 * "bbbab"
 * 输出:
 * <p>
 * 4
 *
 * @author Xiaoyu
 * @date 2020/4/18 - 9:00
 */
public class Solution {
    public int longestPalindromeSubseq(String s) {
        /**
         * 1.找一个最大的状态,考虑使用dp
         * 2.总问题可以转换成一系列子问题,就是s[0,n]的最大子序列,这个加上+1后是否能够加到最长子序列的后面变成回文字符
         * 3.每次都要更新搜索一次最大子序列,因为有可能后面的字母增多,有新的子序列和原来的最大子序列的长度相等
         */
        if (s.isEmpty()) return 0;
        if (s.length() <= 1) return s.length();
        int len = s.length();
        int maxLen = 0;//定义回文符最大长度
        int[][] dp = new int[len][len];
        for (int left = len - 1; left >= 0; left--) {
            dp[left][left] = 1;
            for (int right = left + 1; right < len; right++) {
                //如果子序列为回文,并且新加字符与第一个字符相等,那么这个也为回文.这个回文的长度为right-left+1
                if (s.charAt(left) == s.charAt(right)) {
                    dp[left][right] = dp[left + 1][right - 1] + 2;
                } else {
                    dp[left][right] = Math.max(dp[left + 1][right], dp[left][right - 1]);
                }
            }
        }
        return dp[0][len - 1];
    }
}
