package com.xiaoxiao.no77组合;

import org.junit.Test;

import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/4/1 - 13:38
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s= new Solution();
        List<List<Integer>> combine = s.combine(4, 3);
        for (List<Integer> integers : combine) {
            System.out.println(integers);
        }
    }
}
