package com.xiaoxiao.countAndSay;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/22 - 14:24
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        String s1 = s.countAndSay(5);
        System.out.println(s1);
    }
}
