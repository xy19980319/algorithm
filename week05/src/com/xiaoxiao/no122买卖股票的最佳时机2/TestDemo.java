package com.xiaoxiao.no122买卖股票的最佳时机2;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/9 - 16:44
 */
public class TestDemo {
    @Test
    public void test() {
        int[] prices = {
                5,3,2,1
        };
        Solution s = new Solution();
        int j = s.maxProfit(prices);
        System.out.println(j);
    }
}
