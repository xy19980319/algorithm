package com.xiaoxiao.no172阶乘后的零;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/29 - 15:19
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s= new Solution();
        int j = s.trailingZeroes(100);
        System.out.println(j);
    }
}
