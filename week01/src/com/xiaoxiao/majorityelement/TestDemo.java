package com.xiaoxiao.majorityelement;

import org.junit.Test;

/**
 * @author Xiaoyu
 * @date 2020/3/13 - 16:35
 */
public class TestDemo {
    @Test
    public void test1() {
        Solution s = new Solution();
        int v = s.majorityElement(2, 2, 1, 1,3, 1, 2);
        System.out.println(v);
    }

}
