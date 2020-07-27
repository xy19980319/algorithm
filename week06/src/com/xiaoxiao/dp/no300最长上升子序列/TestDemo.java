package com.xiaoxiao.dp.no300最长上升子序列;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/13 - 17:54
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s= new Solution();
        int[] nums = {10,9,2,5,3,7,101,18};
        int i = s.lengthOfLIS(nums);
        System.out.println(i);
    }
}
