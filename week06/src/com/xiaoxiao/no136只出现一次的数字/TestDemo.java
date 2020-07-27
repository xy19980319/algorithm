package com.xiaoxiao.no136只出现一次的数字;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/13 - 9:53
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums = {4, 1, 2, 1, 2};
        Solution s= new Solution();
        int i = s.singleNumber(nums);
        System.out.println(i);
    }
}
