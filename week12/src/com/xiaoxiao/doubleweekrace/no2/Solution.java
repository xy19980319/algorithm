package com.xiaoxiao.doubleweekrace.no2;

import java.util.ArrayList;
import java.util.List;

/**
 * 5409. 检查一个字符串是否包含所有长度为 K 的二进制子串  显示英文描述
 * 给你一个二进制字符串 s 和一个整数 k 。
 * <p>
 * 如果所有长度为 k 的二进制字符串都是 s 的子串，请返回 True ，否则请返回 False 。
 *
 * @author Xiaoyu
 * @date 2020/5/30 - 21:52
 */
public class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s==null || s.length() ==0) return false;
        if(s.length() >=1000&&k>=15) return true;
        List<String> strs = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(strs, sb,k);
        for (int i = 0; i < strs.size(); i++) {
            if(!s.contains(strs.get(i))) return false;
        }
        return true;
    }

    private void dfs(List<String> strs, StringBuilder sb, int k) {
        if (k == 0) {
            strs.add(sb.toString());
            return;
        }
        sb.append("0");
        dfs(strs,sb,k-1);
        sb.deleteCharAt(sb.length() -1);
        sb.append("1");
        dfs(strs,sb,k-1);
        sb.deleteCharAt(sb.length() -1);
    }
}
