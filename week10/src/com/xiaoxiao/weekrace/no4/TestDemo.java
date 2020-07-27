package com.xiaoxiao.weekrace.no4;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/5/17 - 12:03
 */
public class TestDemo {
    @Test
    public void test() {
       //int[][] points = {{-3,0},{3,0},{2,6},{5,4},{0,9},{7,8}};
       int[][] points = {{-2,0},{2,0},{0,2},{0,-2}};
       Solution s = new Solution();
        int i = s.numPoints(points, 2);
        System.out.println(i);
    }
}
