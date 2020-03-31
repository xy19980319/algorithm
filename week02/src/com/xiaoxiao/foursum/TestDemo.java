package com.xiaoxiao.foursum;

import org.junit.Test;

import java.util.List;

/**
 * @author Xiaoyu
 * @date 2020/3/17 - 21:29
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        int[] nums = {0,0,0,0,0,0,0,0,0,0,0,0,0

        };
        List<List<Integer>> lists = s.fourSum(nums, 0);
        System.out.println(lists);

    }
}
