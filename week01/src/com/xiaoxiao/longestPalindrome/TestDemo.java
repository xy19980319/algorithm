package com.xiaoxiao.longestPalindrome;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/10 - 22:27
 */
public class TestDemo {

    @Test
    public void test01() {
        String a = "abcdsfghj";
        int v = a.lastIndexOf("5");
        System.out.println(v);
    }
    @Test
    public void test02() {
        Solution solution = new Solution();
        String s1 = solution.longestPalindrome("abcdbbfcba");
        System.out.println(s1);
        String s = solution.longestPalindrome("aaabaaaa");
        System.out.println(s);
    }
}
