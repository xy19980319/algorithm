package com.xiaoxiao.背包dp.no518零钱兑换2;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/6/6 - 10:43
 */
public class TestDemo {
    @Test
    public void test() {
/*        int[] coins = {474,83,404,3};
        int amount = 264;*/
        int[] coins = {1,2,5};
        int amount = 5;
        Solution s = new Solution();
        int i = s.change(amount,coins);
        System.out.println(i);

    }
}
