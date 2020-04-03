package com.xiaoxiao.不同路径263;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/31 - 11:49
 */
public class TestDemo {
    @Test
    public void test() {
        int[][] route = {
                {0,1,0,0,0},
                {1,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}};
        Solution s = new Solution();
        int i = s.uniquePathsWithObstacles(route);
        System.out.println(i);
    }
}
