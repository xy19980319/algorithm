package com.xiaoxiao.no187周赛.no3;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/5/3 - 10:27
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums = {4,2,2,2,4,4,2,2};
        Solution s = new Solution();
        int i = s.longestSubarray(nums, 0);
        System.out.println(i);
    }
}
