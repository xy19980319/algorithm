package com.xiaoxiao.第k个排列;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/26 - 15:41
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        String permutation = s.getPermutation(2, 1);
        System.out.println(permutation);
    /*    int recur = s.recur(4);
        System.out.println(recur);*/
    }
}
