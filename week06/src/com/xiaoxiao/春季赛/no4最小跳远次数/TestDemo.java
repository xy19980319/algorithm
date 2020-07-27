package com.xiaoxiao.春季赛.no4最小跳远次数;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/18 - 16:53
 */
public class TestDemo {
    @Test
    public void test() {
        int[] jump = {2, 5, 1, 1, 1, 1};
        Solution s= new Solution();
        int i = s.minJump(jump);
        System.out.println(i);
    }
}
