package com.xiaoxiao.插入区间;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/26 - 0:39
 */
public class TestDemo {
    @Test
    public void test() {
        int[][] intervals= {{1,2},{3,5},{6,7},{8,10},{12,14},{20,22}};
        int[] newInterval = {3,20};
        Solution s = new Solution();
        int[][] insert = s.insert(intervals, newInterval);
        for (int[] ints : insert) {
            for (int i : ints) {
                System.out.print(i+",");
            }
            System.out.println();
        }
    }
}
