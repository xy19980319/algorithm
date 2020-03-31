package com.xiaoxiao.palindrome;

import java.util.Objects;

/**
 * @author Xiaoyu
 * @date 2020/3/12 - 22:05
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 ) {
            return false;
        }
        if (x >= 0 && x < 10) {
            return true;
        }
        int k = x;
        int n = 0;
        while (k > 0) {
            n = k % 10 + n * 10;
            k /= 10;
        }
        return n == x ? true : false;
    }
}
