package com.xiaoxiao.面试题13机器人的运动范围;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/8 - 10:16
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        int j = s.movingCount(35, 37, 18);
        System.out.println(j);
    }
}
