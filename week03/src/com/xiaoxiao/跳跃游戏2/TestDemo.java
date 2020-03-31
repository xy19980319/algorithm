package com.xiaoxiao.跳跃游戏2;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/23 - 18:34
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums = {2,3,1,1,4};
        Solution s= new Solution();
        int jump = s.jump(nums);
        System.out.println(jump);
    }
}
