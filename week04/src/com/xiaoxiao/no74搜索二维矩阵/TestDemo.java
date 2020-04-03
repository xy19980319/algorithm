package com.xiaoxiao.no74搜索二维矩阵;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/31 - 23:21
 */
public class TestDemo {
    @Test
    public void test() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        Solution s = new Solution();
        boolean b = s.searchMatrix(matrix, 13);
        System.out.println(b);
    }
}
