package com.xiaoxiao.longestPalindrome;

/**
 * @author Xiaoyu
 * @date 2020/3/10 - 21:40
 */
public class Solution {
    public String longestPalindrome(String s) {
        if (s == null) {
            return null;
        }
        if (s.equals("")) {
            return "";
        }
        String longest = String.valueOf(s.charAt(0));
        String longestTemp = longest;
        //1.将字符串转换成数组,然后定义左指针
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            longestTemp = find(s, chars, i);
            if (longestTemp != null) {
                if (longestTemp.length() > longest.length()) {
                    longest = longestTemp;
                }
            }

        }
        return longest;
    }

    private String find(String s, char[] chars, int i) {
        int last = s.lastIndexOf(chars[i]);
        if (last == i) {
            return null;
        }
        char c = chars[i];
        String str = s.substring(i, last + 1);
        String longStr = findin(str, c);

        return longStr;
    }

    private String findin(String s, char c) {
        int firstCurr = 0;
        int lastCurr = s.length() - 1;
        //健壮性判断
        if (firstCurr == lastCurr) {
            return null;
        }

        while (firstCurr < lastCurr) {
            if (s.charAt(firstCurr++) != s.charAt(lastCurr--)) {

                String substring = s.substring(0, s.substring(0, s.length()-1).lastIndexOf(c)+1);
                return findin(substring, c);
            }
        }
        return s;
    }
}
