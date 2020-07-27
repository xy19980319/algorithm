package com.xiaoxiao.春季赛.no2传递信息;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/18 - 15:49
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s= new Solution();
       // int[][] relation = {{0,2},{2,1},{3,4},{2,3},{1,4},{2,0},{0,4}};
        int[][] relation = {{0,2},{2,1}};
        int i = s.numWays(3, relation, 2);
        System.out.println(i);
    }
}
