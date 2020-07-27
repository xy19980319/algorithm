package com.xiaoxiao.no14最长公共前缀;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Xiaoyu
 * @date 2020/6/15 - 8:49
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length ==0) return "";
        int len = strs.length;
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        String[] dp = new String[len];
        dp[0] = strs[0];
        for (int i = 1; i < strs.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < dp[i-1].length(); j++) {
                char temp = dp[i-1].charAt(j);
                if(temp==strs[i].charAt(j)) sb.append(temp);
                else break;
            }
            if(sb.length()==0) return "";
            dp[i] = sb.toString();
        }
        return dp[len-1];
    }
}
