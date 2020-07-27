package com.xiaoxiao.背包dp.no322零钱兑换;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/6/5 - 23:37
 */
public class TestDemo {
    @Test
    public void test() {
        int[] coins = {474,83,404,3};
        int amount = 264;
        Solution s = new Solution();
        int i = s.coinChange1(coins, amount);
        System.out.println(i);

    }
}
