package com.xiaoxiao.no125验证回文串;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/9 - 19:44
 */
public class TestDemo {
    @Test
    public void test() {
        String str = "race a car";
        Solution s = new Solution();
        boolean palindrome = s.isPalindrome(str);
        System.out.println(palindrome);
    }
}
