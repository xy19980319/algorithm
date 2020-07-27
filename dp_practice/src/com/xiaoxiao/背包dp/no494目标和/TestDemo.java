package com.xiaoxiao.背包dp.no494目标和;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/6/2 - 23:09
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums = {1, 1, 1, 1, 1};
        Solution s = new Solution();
        int i = s.findTargetSumWays(nums, 3);
        System.out.println(i);

    }
}
