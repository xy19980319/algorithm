package com.xiaoxiao.no205同构字符串;

/**
 * @author Xiaoyu
 * @date 2020/4/29 - 21:22
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] hash = new int[300];
        //看看是不是用过映射了
        boolean[] used = new boolean[300];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i);
            if (hash[index] == 0) {
                hash[index] = t.charAt(i);
                //如果用过
                if (used[t.charAt(i)]) return false;
                else used[t.charAt(i)] = true;
            } else {
                if (hash[index] != t.charAt(i)) return false;
            }
        }
        return true;
    }
}
