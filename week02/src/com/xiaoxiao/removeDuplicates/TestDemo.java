package com.xiaoxiao.removeDuplicates;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/20 - 23:20
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        int[] nums = new int[] {
                1    };
        int len = s.removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }
    }
}
