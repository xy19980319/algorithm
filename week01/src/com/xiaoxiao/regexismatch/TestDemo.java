package com.xiaoxiao.regexismatch;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/13 - 19:18
 */
public class TestDemo {
    @Test
    public void test1() {
        boolean a = false||true;
        System.out.println(a);
    }
    @Test
    public void test2() {
        Solution s = new Solution();
        boolean match = s.isMatch("aaaaaa", "a*aaaa");
        System.out.println(match);
    }
}
