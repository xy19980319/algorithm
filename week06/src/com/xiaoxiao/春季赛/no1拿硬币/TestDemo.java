package com.xiaoxiao.春季赛.no1拿硬币;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/18 - 15:06
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s= new Solution();
        int[] nums = {1,1,1};
        int i = s.minCount(nums);
        System.out.println(i);
    }
}
