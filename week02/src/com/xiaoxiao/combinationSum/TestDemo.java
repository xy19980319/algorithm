package com.xiaoxiao.combinationSum;

import org.junit.Test;

import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/3/22 - 14:57
 */
public class TestDemo {
    @Test
    public void test() {
        int nums[] = {8,7,4,3};
        Solution s = new Solution();
        List<List<Integer>> lists = s.combinationSum(nums, 11);
        System.out.println(lists);
    }
}
