package com.xiaoxiao.线性dp.no309最佳买卖股票时机含冷冻期;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/5/13 - 11:57
 */
public class TestDemo {
    @Test
    public void test() {
        int[] prices = {
 2,6,8,7,8,7,9,4,1,2,4,5,8
        };
        Solution s = new Solution();
        int i = s.maxProfit( prices);
        System.out.println(i);
    }
}
