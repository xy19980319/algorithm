package com.xiaoxiao.weekrace.no2;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/6/14 - 11:02
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums = {4,3,1,1,3,3,2};
        Solution s= new Solution();
        int i = s.findLeastNumOfUniqueInts(nums, 3);
        System.out.println(i);
    }
}
