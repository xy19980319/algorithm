package com.xiaoxiao.线性dp.no300最长上升子序列;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/5/3 - 10:03
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums ={1,2,3,1,2,3};
        Solution s= new Solution();
        int i = s.lengthOfLIS(nums);
        System.out.println(i);
    }
}
