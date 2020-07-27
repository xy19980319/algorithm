package com.xiaoxiao.no168Excel表列名称;

/**
 * @author Xiaoyu
 * @date 2020/4/29 - 13:32
 */
public class Solution {
    public String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        while (n!=0) {
            n= n-1;
            char temp = (char)(n%26+'A');
            res.insert(0,temp);
            n /= 26;
        }

        return res.toString();
    }
}
