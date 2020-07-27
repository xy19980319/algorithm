package com.xiaoxiao.weekrace.no2;

/**
 * 5417. 定长子串中元音的最大数目  显示英文描述
 * 给你字符串 s 和整数 k 。
 * 请返回字符串 s 中长度为 k 的单个子字符串中可能包含的最大元音字母数。
 * 英文中的 元音字母 为（a, e, i, o, u）。
 *
 * @author Xiaoyu
 * @date 2020/5/24 - 9:16
 */
public class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int len = s.length();

        int start = 0;
        int end = k - 1;

        for (int i = 0; i < k; i++) {
            if (isyuanyin(s, i)) count++;
        }
        int max = count;

        while (end != len-1) {
            if(isyuanyin(s,end+1)) count++;
            if(isyuanyin(s,start)) count--;
            max = Math.max(max,count);
            start++;
            end++;
        }
        return max;
    }

    private boolean isyuanyin(String s, int i) {
        if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            return true;
        else return false;
    }
}
