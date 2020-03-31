package com.xiaoxiao.面试题1716按摩师;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/24 - 21:25
 */
public class TestDemo {
    @Test
    public void test() {
        long start = System.currentTimeMillis();
        Solution s = new Solution();
        int[] nums = {0};
        int massage = s.massage(nums);
        System.out.println(massage);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
