package com.xiaoxiao.weekrace.no3;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Xiaoyu
 * @date 2020/5/10 - 10:47
 */
public class TestDemo {
    @Test
    public void test() {
        int[][] edges = {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
        Arrays.sort(edges, Comparator.comparingInt(a -> a[1]));
        for (int[] edge : edges) {
            for (int i : edge) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
