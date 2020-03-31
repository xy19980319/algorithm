package com.xiaoxiao.countAndSay;

/**
 * @author Xiaoyu
 * @date 2020/3/22 - 14:01
 */
public class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        return solution(countAndSay(n - 1));

    }

    private String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;//计数相同的书
        char temp = s.charAt(0);
        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            //如果后一个字符不等于前一个
            if (s.charAt(i) != temp) {
                sb.append(count);
                sb.append(temp);
                count = 1;
                temp = s.charAt(i);
            } else count++;


            //已经遍历完列
            if (i == s.length() - 1) {
                sb.append(count);
                sb.append(temp);
            }
        }
        return sb.toString();
    }
}
