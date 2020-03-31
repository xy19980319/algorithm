package com.xiaoxiao.removeElement;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/20 - 23:43
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        int[] nums = new int[] {
2,2
        };
        int len = s.removeElement(nums, 2);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }
    }
}
