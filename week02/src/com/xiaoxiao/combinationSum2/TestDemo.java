package com.xiaoxiao.combinationSum2;

import org.junit.Test;

import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/3/22 - 18:11
 */
public class TestDemo  {
    @Test
    public void test() {
        int[] nums = {10,1,1,1,2,7,6,1,5};
        Solution s = new Solution();
        List<List<Integer>> lists = s.combinationSum2(nums, 8);
        System.out.println(lists);
    }
}
