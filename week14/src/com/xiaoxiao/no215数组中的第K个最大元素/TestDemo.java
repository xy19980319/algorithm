package com.xiaoxiao.no215数组中的第K个最大元素;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/6/8 - 23:25
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        Solution s = new Solution();
        int kthLargest = s.findKthLargest(nums, 2);
        System.out.println(kthLargest);
    }

}
