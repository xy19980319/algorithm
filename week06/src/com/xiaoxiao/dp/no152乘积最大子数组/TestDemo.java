package com.xiaoxiao.dp.no152乘积最大子数组;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/13 - 23:42
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums ={2,3,-2,4};
        Solution s= new Solution();
        int i = s.maxProduct(nums);
        System.out.println(i);
    }
}
