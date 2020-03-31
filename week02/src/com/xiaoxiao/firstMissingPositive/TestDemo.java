package com.xiaoxiao.firstMissingPositive;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/22 - 23:54
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums = {7,8,9,11,12};
        Solution s= new Solution();
        int i = s.firstMissingPositive(nums);
        System.out.println(i);
    }
}
