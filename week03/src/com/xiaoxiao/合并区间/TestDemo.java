package com.xiaoxiao.合并区间;


import org.junit.Test;


/**
 * @author Xiaoyu
 * @date 2020/3/25 - 19:36
 */
public class TestDemo {
    @Test
    public void test() {
        int[][] intervals = {{2,6}, {1,4}, {6,7},{7,9},{1,10}};
        Solution s = new Solution();
        int[][] merge = s.merge(intervals);
        for (int[] ints : merge) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println("-----");
        }
    }
}
