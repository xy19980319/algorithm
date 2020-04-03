package com.xiaoxiao.no88合并两个有序数组;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/3 - 11:24
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums1 = {1, 1, 1, 0, 0, 0};
        int[] nums2 = {2, 3, 4};
        Solution s = new Solution();
        s.merge(nums1,0,nums2,3);
        for (int i : nums1) {
            System.out.println(i);
        }
    }
}
