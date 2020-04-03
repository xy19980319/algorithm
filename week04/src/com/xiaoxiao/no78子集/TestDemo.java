package com.xiaoxiao.no78子集;

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
        int[] nums = {2,1,3};
        List<List<Integer>> subsets = s.subsets(nums);
        subsets.forEach(System.out::print);


    }
}
