package com.xiaoxiao.no198打家劫舍;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/15 - 8:19
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums = {2,7,9,3,1};
        Solution s = new Solution();
        int rob = s.rob(nums);
        System.out.println(rob);
    }
}
