package com.xiaoxiao.全排列2;

import org.junit.Test;

import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/3/24 - 19:34
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        int[] nums = {1};
        List<List<Integer>> lists = s.permuteUnique(nums);
        System.out.println(lists);
    }
}
