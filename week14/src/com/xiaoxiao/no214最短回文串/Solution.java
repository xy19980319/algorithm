package com.xiaoxiao.no214最短回文串;

import java.util.Arrays;

/**
 * 给定一个字符串 s，你可以通过在字符串前面添加字符将其转换为回文串。找到并返回可以用这种方式转换的最短回文串。
 * 示例 1:
 * 输入: "aacecaaa"
 * 输出: "aaacecaaa"
 * 示例 2:
 * 输入: "abcd"
 * 输出: "dcbabcd"
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shortest-palindrome
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Xiaoyu
 * @date 2020/6/8 - 21:29
 */
public class Solution {
    public String shortestPalindrome(String s) {
        int len = s.length();
        char[] chars = s.toCharArray();
        //找到0-x 这个长度最长  "aacecaaa"
        StringBuilder res = new StringBuilder();
        int index = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (!isSingleOrDoubleEcho(chars, 0,i)) {
                //如果不是回文串加入
                res.append(chars[i]);
            } else {
                //如果是回文
                break;
            }
        }
        //暴力法超时
        res.append(s);
        return res.toString();

    }

    private boolean isSingleOrDoubleEcho(char[] chars, int start, int end) {
        boolean isSingle = end % 2 == 0;//看看是不是奇数
        return isSingle ? isSingleEcho(chars, start,end) : isDoubleEcho(chars, start,end);
    }

    private boolean isSingleEcho(char[] chars, int start, int end) {
        int mid = (end-start)/2+start;
        int count = 0;
        while(start < end&&start <= mid-count) {
            count++;
            if (chars[start++] != chars[end--]) return false;
            if(chars[mid-count] !=chars[mid+count]) return false;
        }
        return true;

    }

    private boolean isDoubleEcho(char[] chars, int start, int end) {
        int mid = (end-start)/2+start;
        int count = 0;
        while(start < end&&start <= mid-count) {
            count++;
            if (chars[start++] != chars[end--]) return false;
            if(chars[mid-count+1] !=chars[mid+count]) return false;
        }
        return true;
    }
}
