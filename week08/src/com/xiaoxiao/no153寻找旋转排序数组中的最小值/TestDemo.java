package com.xiaoxiao.no153寻找旋转排序数组中的最小值;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/26 - 9:37
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums = {10,10,1,10,10,10,1,10};
        Solution s = new Solution();
        int min = s.findMin(nums);
        System.out.println(min);
    }
}
