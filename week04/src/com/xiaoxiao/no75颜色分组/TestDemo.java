package com.xiaoxiao.no75颜色分组;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/1 - 11:38
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums = {2,2,2,0,0,0,0,0,0,0,1,1,2};
        Solution s = new Solution();
        s.sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
