package com.xiaoxiao.no220存在重复元素3;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/6/9 - 20:30
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums = {1,5,1,5,1,5,1,5,1,5,1,5};
        Solution s= new Solution();
        boolean b = s.containsNearbyAlmostDuplicate(nums, 1, 5);
        System.out.println(b);
    }
}
