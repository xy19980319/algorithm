package com.xiaoxiao.no289生命游戏;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/2 - 23:08
 */
public class TestDemo {
    @Test
    public void test() {
        int[][] nums = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        Solution s = new Solution();
        s.gameOfLife(nums);
        for (int[] num : nums) {
            for (int i : num) {
                System.out.print(i+",");
            }
            System.out.println();
        }
    }


}
