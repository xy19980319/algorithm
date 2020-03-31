package com.xiaoxiao.lengthOfLIS;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/14 - 18:36
 */
public class TestDemo {
    @Test
    public void test1() {
        Solution s= new Solution();
        int v = s.lengthOfLIS(new int[]{
                4,10,4,3,8,9
        });
        System.out.println(v);
    }
}
