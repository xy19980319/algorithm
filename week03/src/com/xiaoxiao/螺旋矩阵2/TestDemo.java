package com.xiaoxiao.螺旋矩阵2;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/26 - 14:34
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        int[][] ints = s.generateMatrix(1);
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i+",");
            }
            System.out.println();
        }
    }
}
