package com.xiaoxiao.no162寻找峰值;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/29 - 10:03
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums = {1,2,1,3,5,6,4};
        Solution s = new Solution();
        int i = s.findPeakElement(nums);
        System.out.println(i);
    }
}
