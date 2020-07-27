package com.xiaoxiao.no171Excel表列序号;

/**
 * @author Xiaoyu
 * @date 2020/4/29 - 12:05
 */
public class Solution {
    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) return 0;
        int sum = 0;
        int mult = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            int num = s.charAt(i) - 'A' + 1;
            sum += num * mult;
            mult *= 26;
        }
        return sum;
    }
}
