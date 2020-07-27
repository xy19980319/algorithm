package com.xiaoxiao.no187周赛.no2;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/5/3 - 10:27
 */
public class TestDemo {
    @Test
    public void test() {
        int[] nums ={1,0,0,1,0,1};
        Solution s = new Solution();
        boolean b = s.kLengthApart(nums, 2);
        System.out.println(b);
    }
}
