package com.xiaoxiao.跳跃游戏;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/25 - 17:57
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums = {0};
        Solution s = new Solution();
        boolean b = s.canJump(nums);
        System.out.println(b);
    }
}
