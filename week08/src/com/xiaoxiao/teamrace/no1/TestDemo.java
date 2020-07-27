package com.xiaoxiao.teamrace.no1;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/25 - 17:44
 */
public class TestDemo {
    @Test
    public void test() {
        int[] score = {1,1};
        Solution s = new Solution();
        int i = s.expectNumber(score);
        System.out.println(i);
    }
}
