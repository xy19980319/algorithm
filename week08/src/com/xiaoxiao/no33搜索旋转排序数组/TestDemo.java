package com.xiaoxiao.no33搜索旋转排序数组;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/27 - 11:48
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums ={1,3,5};
        Solution s= new Solution();
        int i = s.search(nums, 3);
        System.out.println(i);
    }
}
