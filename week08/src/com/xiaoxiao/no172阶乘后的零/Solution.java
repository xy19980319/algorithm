package com.xiaoxiao.no172阶乘后的零;

/**
 * @author Xiaoyu
 * @date 2020/4/29 - 15:15
 */
public class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}
