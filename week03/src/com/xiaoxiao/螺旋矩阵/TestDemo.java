package com.xiaoxiao.螺旋矩阵;

import org.junit.Test;

import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/3/25 - 14:38
 */
public class TestDemo {
    @Test
    public void test() {
        int[][] matrix = {
                {1, 2, 3,99,999},
                {4, 5, 6,88,888},
                {7, 8, 9,77,777},
                {10,11,12,66,666}
                //{13,14,15,55,555}
        };
        Solution s = new Solution();
        List<Integer> integers = s.spiralOrder(matrix);
        System.out.println(integers);
    }
}
