package com.xiaoxiao.weekrace.no3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/5/31 - 10:57
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        int[][] cs = {{0,1},{1,3},{2,3},{4,0},{4,5}};
        int i = s.minReorder(6, cs);
        System.out.println(i);
    }
}
