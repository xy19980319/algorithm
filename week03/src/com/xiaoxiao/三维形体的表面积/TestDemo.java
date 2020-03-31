package com.xiaoxiao.三维形体的表面积;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/25 - 0:48
 */
public class TestDemo {
    @Test
    public void test() {
        int[][] grid = {{1,2},{3,4}};
        Solution s = new Solution();
        int i = s.surfaceArea(grid);
        System.out.println(i);
    }
}
