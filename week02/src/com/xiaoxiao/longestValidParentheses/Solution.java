package com.xiaoxiao.longestValidParentheses;

import java.util.Stack;

/**
 * 46306 154644
 给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
 示例 1:
 输入: "(()"
 输出: 2
 解释: 最长有效括号子串为 "()"
 示例 2:
 输入: ")()())"
 输出: 4
 解释: 最长有效括号子串为 "()()"
 * @author Xiaoyu
 * @date 2020/3/21 - 15:06
 */
public class Solution {
    public int longestValidParentheses(String s) {
        if(s.length() <2) return 0;

        //新建一个栈来规定下标
        Stack<Integer> underNum = new Stack<>();
        int max = 0;

        //首先将-1压入站
        underNum.push(-1);

        //遍历s
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(') {
                underNum.push(i);
            }else {
                underNum.pop();
                if(underNum.isEmpty()) {
                    underNum.push(i);
                }else {
                    max = Math.max(max, i - underNum.peek());
                }
            }
        }
        return max;
    }
}
