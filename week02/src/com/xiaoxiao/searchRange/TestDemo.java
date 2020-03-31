package com.xiaoxiao.searchRange;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/21 - 16:36
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s= new Solution();
        int[] nums = {};
        int[] ints = s.searchRange(nums, 6);
        for (int i : ints) {
            System.out.print(i);
        }
    }
}
