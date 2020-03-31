package com.xiaoxiao.minIncrementForUnique;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/22 - 10:07
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        int[] A = {3,2,1,2,1,7};
        int i = s.minIncrementForUnique(A);
        System.out.println(i);

    }
}
