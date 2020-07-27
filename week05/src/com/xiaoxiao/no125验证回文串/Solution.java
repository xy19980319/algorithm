package com.xiaoxiao.no125验证回文串;

/**
 * @author Xiaoyu
 * @date 2020/4/9 - 19:33
 */
public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return true;
        s = s.trim();//去除多余空格
        if (s.length() == 0) return true;
        s = s.toLowerCase();//变成小写
        int first = 0;
        int last = s.length() - 1;
        while (first < last) {
            //如果前面的不是字符或者数字,则往后找
            while (first < last&&!Character.isLetterOrDigit(s.charAt(first))) {
                first++;
                if(first > last) return true;//说明无效字符遍历完后已经将字符串遍历完
            }
            //如果后面指针不是字符或者数字,向前找
            while (first < last&&!Character.isLetterOrDigit(s.charAt(last))) {
                last--;
                if(first > last) return true;//说明无效字符遍历完后已经将字符串遍历完
            }
            //比较是否相等
            if(s.charAt(first) == s.charAt(last)) {
                first++;
                last--;
            }else return false;
        }
        return true;
    }
}
