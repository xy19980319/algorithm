package com.xiaoxiao.longestPalindrome;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/19 - 19:59
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        int v = s.longestPalindrome("aadcaad");
        System.out.println(v);
    }
}
