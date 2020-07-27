package com.xiaoxiao.no990等式方程的可满足性;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/6/8 - 9:54
 */
public class TestDemo {
    @Test
    public void test() {
        Solution s = new Solution();
        String[] a = {"a==b","b!=a"};
        boolean b = s.equationsPossible(a);
    }
}
