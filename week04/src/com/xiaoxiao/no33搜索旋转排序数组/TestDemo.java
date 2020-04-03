package com.xiaoxiao.no33搜索旋转排序数组;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/4/1 - 18:51
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums = {4,5,6,7,0,1,2};
        Solution s = new Solution();
        int search = s.search(nums, 0);
        System.out.println(search);
    }
}
