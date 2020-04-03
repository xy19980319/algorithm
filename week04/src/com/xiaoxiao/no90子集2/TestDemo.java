package com.xiaoxiao.no90子集2;

import org.junit.Test;

import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/4/1 - 14:29
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        int[] nums = {1,2,2};
        List<List<Integer>> subsets = s.subsetsWithDup(nums);
        subsets.forEach(System.out::print);


    }
}
