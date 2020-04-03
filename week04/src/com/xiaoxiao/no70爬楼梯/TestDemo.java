package com.xiaoxiao.no70爬楼梯;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/31 - 22:59
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        int j = s.climbStairs(1);
        System.out.println(j);
    }
    @Test
    public void test1() {
        int len = 7;
        for (int i = 0; i < len; i++) {
            int c = i & 1;
            System.out.print(c +" ");
        }
    }
}
