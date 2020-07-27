package com.xiaoxiao.no151翻转字符串里的单词;

/**
 * 给定一个字符串，逐个翻转字符串中的每个单词。
 *  
 * 示例 1：
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 * 示例 2：
 * 输入: "  hello world!  "
 * 输出: "world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 *
 * @author Xiaoyu
 * @date 2020/4/10 - 10:49
 */
public class Solution {
    public String reverseWords(String s) {
        if (s == null) return null;
        s = s.trim();
        if(s.length() ==0) return "";
        String[] strs = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            if("".equals(strs[i])) continue;
            if(i==0) res.append(strs[i]);
            else res.append(strs[i]).append(" ");
        }
        return res.toString();
    }
}
