package com.xiaoxiao.最大子序和;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/25 - 12:06
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        Solution s = new Solution();
        int i = s.maxSubArray(nums);
        System.out.println(i);
    }
}
