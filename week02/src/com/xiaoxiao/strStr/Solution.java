package com.xiaoxiao.strStr;

/**
 * 实现 strStr() 函数。
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * 示例 1:
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *
 * @author Xiaoyu
 * @date 2020/3/21 - 0:14
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack.isEmpty() || needle.length() > haystack.length()) return -1;
        char ch = needle.charAt(0);
        boolean isMatch = true;
        //对待匹配字符进行遍历
        for (int i = 0; i < haystack.length(); i++) {
            if (ch == haystack.charAt(i)) {
                for (int j = 1; j < needle.length(); j++) {
                    isMatch = true;
                    if (i + j >= haystack.length() ||( i + j < haystack.length()&&haystack.charAt(i + j) != needle.charAt(j))) {
                        isMatch = false;
                        break;
                    }
                }
                if (isMatch) {
                    return i;
                }

            }
        }
        return -1;
    }
}
