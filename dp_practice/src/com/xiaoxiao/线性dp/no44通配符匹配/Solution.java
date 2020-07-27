package com.xiaoxiao.线性dp.no44通配符匹配;

/**
 * 给定一个字符串 (s) 和一个字符模式 (p) ，实现一个支持 '?' 和 '*' 的通配符匹配。
 * <p>
 * '?' 可以匹配任何单个字符。
 * '*' 可以匹配任意字符串（包括空字符串）。
 * 两个字符串完全匹配才算匹配成功。
 * 说明:
 * <p>
 * s 可能为空，且只包含从 a-z 的小写字母。
 * p 可能为空，且只包含从 a-z 的小写字母，以及字符 ? 和 *。
 * 示例 1:
 * <p>
 * 输入:
 * s = "aa"
 * p = "a"
 * 输出: false
 * 解释: "a" 无法匹配 "aa" 整个字符串。
 *
 * @author Xiaoyu
 * @date 2020/5/25 - 22:42
 */
public class Solution {
    public boolean isMatch(String s, String p) {
        if (s == null && p == null) return true;
        if (s == null || p == null) return false;
        if (s.length() == 0 && p.length() == 0) return true;
        int sLen = s.length();
        int pLen = p.length();
        boolean[][] dp = new boolean[pLen + 1][sLen + 1];//表示模式的前i个字符与s的前j个字符是否匹配
        for (int i = 1; i <= pLen; i++) {
            if (p.charAt(i - 1) == '*')
                dp[i][0] = true;
            else break;
        }
/*        for (int i = 0; i <= sLen; i++) {
            dp[0][i] = true;
        }*/
        dp[0][0] = true;
        for (int i = 1; i <= pLen; i++) {
            for (int j = 1; j <= sLen; j++) {
                if (p.charAt(i - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] ||  dp[i][j - 1];
                } else if (p.charAt(i - 1) == '?' || p.charAt(i - 1) == s.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }
        return dp[pLen][sLen];
    }
}
