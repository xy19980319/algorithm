package com.xiaoxiao.线性dp.no123买卖股票的最佳时机3;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/5/12 - 11:18
 */
public class TestDemo {
    @Test
    public void test() {
        int[] prices = {2,6,8,7,8,7,9,4,1,2,4,5,8};
        Solution s= new Solution();
        int i = s.maxProfit(prices);
        System.out.println(i);
    }
}
