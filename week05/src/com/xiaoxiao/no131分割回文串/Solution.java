package com.xiaoxiao.no131分割回文串;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/4/12 - 22:50
 */
public class Solution {
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> partition(String s) {
        if (s == null || s.length() == 0) return res;
        boolean[][] dp = new boolean[s.length()][s.length()];//代表s[i][j],i-j的字符串
        //先进行预处理,将需要用到的位置存放到dp数组中
        for (int right = 0; right < s.length(); right++) {
            for (int left = 0; left <= right; left++) {
                //如果前后字符相等并且除了前后字符的字符串是回文,那么这个位置也是回文
                if (s.charAt(right) == s.charAt(left) && ((right - left <= 2) || dp[left + 1][right - 1]))
                    dp[left][right] = true;
            }
        }
        List<String> temp = new ArrayList<>();
        backtrack(temp,dp, s,0,s.length());
        return res;
    }

    private void backtrack(List<String> temp, boolean[][] dp, String s, int start, int end) {
        //先把整个字符串放进去,如果不是回文,那么拿出第一个字母,看后面的是不是回文
        if (start == end ) {
            res.add(new ArrayList<>(temp));
            return;
        }
        //如果该位置是回文字符
        for (int i = start; i <end; i++) {
            if (!dp[start][i]) continue;
            temp.add(s.substring(start,i+1));
            backtrack(temp,dp,s,i+1,end);
            temp.remove(temp.size()-1);
        }
    }
}
