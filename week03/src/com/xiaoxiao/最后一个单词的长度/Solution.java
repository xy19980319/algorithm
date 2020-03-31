package com.xiaoxiao.最后一个单词的长度;

/**
 * @author Xiaoyu
 * @date 2020/3/26 - 14:09
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() ==0) return 0;
        //必须去掉字符串后面的空格
        s = s.trim();
        int i = s.lastIndexOf(' ');
        if(i==-1) return s.length();
        return s.substring(i+1).length();
    }
}
