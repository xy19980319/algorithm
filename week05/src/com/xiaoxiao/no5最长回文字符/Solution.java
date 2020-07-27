package com.xiaoxiao.no5最长回文字符;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * 示例 1：
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * @author Xiaoyu
 * @date 2020/4/12 - 23:43
 */
public class Solution {
    public String longestPalindrome(String s) {
        if (s == null) return null;
        if (s.length() <= 1) return s;
        int longestlen = 0;
        int largeright = 0;
        int largeleft = 0;
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for (int right = 0; right < len; right++) {
            for (int left = 0; left <= right; left++) {
                if (s.charAt(left) == s.charAt(right) && (right - left <= 2 || dp[left + 1][right - 1])) {
                    //记录最长回文字符的位置
                    if(right - left + 1>longestlen) {
                        longestlen=right - left + 1;
                        largeright=right;
                        largeleft=left;
                    }
                    dp[left][right] = true;
                }
            }
        }
        return s.substring(largeleft,largeright+1);
    }
}
