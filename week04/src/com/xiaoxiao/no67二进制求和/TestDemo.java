package com.xiaoxiao.no67二进制求和;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/31 - 17:25
 */
public class TestDemo {
    @Test
    public void test() {
        String a = "1001111", b = "10";
        Solution s = new Solution();
        String s1 = s.addBinary(a, b);
        System.out.println(s1);
    }
}
