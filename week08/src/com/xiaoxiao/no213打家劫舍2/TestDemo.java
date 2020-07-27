package com.xiaoxiao.no213打家劫舍2;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/30 - 10:39
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums= {2,3,2};
        Solution s= new Solution();
        int rob = s.rob(nums);
        System.out.println(rob);

    }
}
