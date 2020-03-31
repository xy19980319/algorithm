package com.xiaoxiao.palindrome;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/12 - 22:30
 */
public class TestDemo {
    @Test
    public void test1() {
        StringBuffer sb = new StringBuffer(new String("100"));
        StringBuffer reverse = sb.reverse();
        System.out.println(sb.length());
        System.out.println(sb);
        System.out.println(reverse);
    }
    @Test
    public void test2() {
        Solution s = new Solution();
        boolean palindrome = s.isPalindrome(12321);
        System.out.println(palindrome);
    }
}
