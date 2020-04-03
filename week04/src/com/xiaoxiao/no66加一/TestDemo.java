package com.xiaoxiao.no66加一;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/31 - 16:03
 */
public class TestDemo {
    @Test
    public void test() {
        int[] num = {9,9,9};
        Solution s= new Solution();
        int[] ints = s.plusOne(num);
        for (int i : ints) {
            System.out.print( i);
        }
    }
}
