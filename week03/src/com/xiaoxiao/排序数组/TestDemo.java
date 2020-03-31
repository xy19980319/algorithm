package com.xiaoxiao.排序数组;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/31 - 10:51
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums = {5,1,1,2,0,0};
        Solution s = new Solution();
        s.sortArray(nums);
        for (int num : nums) {
            System.out.print(num);
        }
    }
}
